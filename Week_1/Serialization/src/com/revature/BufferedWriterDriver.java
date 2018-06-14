package com.revature;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDriver {

	private static final String filename = "src/com/revature/sampleFile.txt";
	
	public static void main(String[] args) {
		

		StringBuilder sb = readFromFile(filename);
		writeToFile(filename, sb);

	}
	
	public static void writeToFile(String filename, StringBuilder sb){
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
	}
	
	public static StringBuilder readFromFile(String filename){
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			

			
			while(br.ready()){
				
				sb.append(br.readLine());
				
			}
			System.out.println(sb);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb;
	}

}
