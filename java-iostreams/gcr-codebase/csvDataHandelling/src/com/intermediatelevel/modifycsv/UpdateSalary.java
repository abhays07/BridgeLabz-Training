package com.intermediatelevel.modifycsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateSalary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\intermediatelevel\\modifycsv\\employee.csv"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\intermediatelevel\\modifycsv\\updated_employee.csv"));
		
		String line=br.readLine();
		bw.write(line);
		bw.newLine();
		
		while((line= br.readLine())!=null) {
			String [] data = line.split(",");
			
			if(data[2].equalsIgnoreCase("IT")){
				double salary = Double.parseDouble(data[3]);
				salary = salary + salary*0.10;
				data[3]=String.valueOf(salary);
			}
			
			bw.write(String.join(",", data));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
