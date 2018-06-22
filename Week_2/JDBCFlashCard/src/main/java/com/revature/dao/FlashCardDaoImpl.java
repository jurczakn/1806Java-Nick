package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.List;

import com.revature.pojos.FlashCard;
import com.revature.util.ConnectionUtil;

public class FlashCardDaoImpl implements FlashCardDao {

	public FlashCard getFlashCard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createFlashCard(FlashCard fc) {
		String question = fc.getQuestion();
		String answer = fc.getAnswer();
		int id = fc.getId();
		
		String sql = "INSERT INTO FLASH_CARDS(FC_QUESTION, FC_ANSWER) VALUES('" 
		+ question + "', '" + answer + "')";
		
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
		
			Statement stmt = conn.createStatement();
			int numRowsAffected = stmt.executeUpdate(sql);
			
			System.out.println("Inserted " + numRowsAffected + " rows!!!");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub

	}

	public List<FlashCard> getAllFlashCards() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFlashCard(FlashCard fc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createFlashCardPreparedStmt(FlashCard fc) {
		String question = fc.getQuestion();
		String answer = fc.getAnswer();
		int id = fc.getId();
		
		String sql = "INSERT INTO FLASH_CARDS(FC_QUESTION, FC_ANSWER) VALUES(?, ?)";
		
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
		
			conn.setAutoCommit(false);  //first step to running a transaction in jdbc
			
			Savepoint s = conn.setSavepoint();  //create a savepoint to rollback to
			
			String[] primaryKeys = new String[1];
			primaryKeys[0] = "FC_ID";
			
			PreparedStatement stmt = conn.prepareStatement(sql, primaryKeys);
			stmt.setString(1, question);
			stmt.setString(2, answer);
			int numRowsAffected = stmt.executeUpdate();
			
			ResultSet generatedKeys = stmt.getGeneratedKeys();
			int newKey = 0;
			while(generatedKeys.next()){
				
				newKey = generatedKeys.getInt(1);
				
			}
			
			if (numRowsAffected > 1){
				
				conn.rollback(s); //rollback to savepoint
				
			}
			
			fc.setId(newKey);
			
			System.out.println("Inserted " + numRowsAffected + " rows!!!");
			System.out.println("New Id = " + newKey);
			
			conn.commit();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
