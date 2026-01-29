package com.intermediatelevel.filterstudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FilterStudents {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\intermediatelevel\\filterstudent\\studentmarks.csv"));
		br.readLine();
		
		String line;
		
		while((line = br.readLine())!=null) {
			String [] data = line.split(",");
			int marks = Integer.parseInt(data[3]);
			
			if(marks>80) {
				System.out.println(Arrays.toString(data));
			}
		}
		
		br.close();
	}
}
