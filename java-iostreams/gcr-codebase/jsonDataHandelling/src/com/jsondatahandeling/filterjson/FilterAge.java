package com.jsondatahandeling.filterjson;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Users\\ronit\\Desktop\\Java Programming Workspace\\java-iostreams\\gcr-codebase\\jsonDataHandelling\\src\\com\\jsondatahandeling\\filterjson\\users.json"));

        for (JsonNode n : root) {
            if (n.get("age").asInt() > 25) {
                System.out.println(n);
            }
        }
    }
}
