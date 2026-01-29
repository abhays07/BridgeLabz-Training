package com.advancedlevel.encryptanddecrypt;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEncryptedCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\advancedlevel\\encryptanddecrypt\\encrypted.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // CSV Header
            writer.write("ID,Name,Email,Salary");
            writer.newLine();

            // Sample Data
            writer.write("1,John," +
                    EncryptUtil.encrypt("john@gmail.com") + "," +
                    EncryptUtil.encrypt("60000"));
            writer.newLine();

            writer.write("2,Alice," +
                    EncryptUtil.encrypt("alice@yahoo.com") + "," +
                    EncryptUtil.encrypt("75000"));
            writer.newLine();

            writer.write("3,Bob," +
                    EncryptUtil.encrypt("bob@outlook.com") + "," +
                    EncryptUtil.encrypt("50000"));
            writer.newLine();

            System.out.println(" Encrypted CSV written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
