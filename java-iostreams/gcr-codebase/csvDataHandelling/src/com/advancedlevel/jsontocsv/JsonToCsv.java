package com.advancedlevel.jsontocsv;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;

public class JsonToCsv {

	public static void main(String[] args) {

		String jsonFile = "C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\advancedlevel\\jsontocsv\\students.json";

		String csvFile = "C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\advancedlevel\\jsontocsv\\students.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

			ObjectMapper mapper = new ObjectMapper();

			List<Student> students = mapper.readValue(new File(jsonFile), new TypeReference<List<Student>>() {
			});

			// CSV Header
			bw.write("ID,Name,Age,Marks");
			bw.newLine();

			// ✅ USE GETTERS
			for (Student s : students) {
				bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getMarks());
				bw.newLine();
			}

			System.out.println("JSON → CSV conversion successful!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
