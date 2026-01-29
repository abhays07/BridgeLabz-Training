package com.basiclevel.readandcountcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
	public static void main(String[] args) {
		int count =0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\basiclevel\\readandcountcsv\\student.csv"))){
			br.readLine(); // Skip header
			
			while((br.readLine())!=null) {
				count++;
			}
			
			System.out.println("Total Records : "+ count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
