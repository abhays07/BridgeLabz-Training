package com.intermediatelevel.sortcsv;

import java.io.*;
import java.util.*;


public class SortBySalary {

    public static void main(String[] args) throws IOException {
        List<String[]> employees = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\csvDataHandelling\\src\\com\\intermediatelevel\\sortcsv\\sortEmployee.csv"));
        br.readLine(); // header

        String line;
        while ((line = br.readLine()) != null) {
            employees.add(line.split(","));
        }

        employees.sort((a, b) ->
                Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

        employees.stream().limit(5).forEach(e ->
                System.out.println(Arrays.toString(e)));

        br.close();
    }
}