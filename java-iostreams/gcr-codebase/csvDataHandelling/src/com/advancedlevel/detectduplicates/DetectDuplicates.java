package com.advancedlevel.detectduplicates;

import java.io.*;
import java.util.*;


public class DetectDuplicates {

    public static void main(String[] args) throws IOException {
        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\advancedlevel\\detectduplicates\\duplicates.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];

            if (!ids.add(id)) {
                System.out.println("Duplicate: " + line);
            }
        }
        br.close();
    }
}
