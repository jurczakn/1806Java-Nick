package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.util.ConnectionUtil;

import oracle.jdbc.internal.OracleTypes;

public class CallableDriver {

	public static void main(String[] args) {
		try (Connection conn = ConnectionUtil.getInstance().getConnection()) {

			String sql = "{call retrieveUser(?, ?)}";
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 3);
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			cstmt.executeQuery();

			ResultSet rs = (ResultSet) cstmt.getObject(2);
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
