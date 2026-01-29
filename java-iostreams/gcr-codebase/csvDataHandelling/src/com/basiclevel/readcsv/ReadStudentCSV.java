package com.basiclevel.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
	public static void main(String [] args ) {
		String filePath = "C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\basiclevel\\readcsv\\student.csv";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			br.readLine();
			
			while((line=br.readLine())!=null) {
				String [] data = line.split(",");
				  System.out.println("ID: " + data[0] +
	                        ", Name: " + data[1] +
	                        ", Age: " + data[2] +
	                        ", Marks: " + data[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
