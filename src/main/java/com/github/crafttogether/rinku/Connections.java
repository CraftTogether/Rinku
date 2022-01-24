package com.github.crafttogether.rinku;

import org.json.JSONArray;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Connections {

    private static Connections INSTANCE;

    public static Connections getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Connections();
        }
        return INSTANCE;
    }

    private File file;

    public Connections() {
        file = new File(Plugin.getInstance().getDataFolder() + "/connections.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
                final String content = "[]"; // Create initial json
                Files.write(Paths.get(getFile().getPath()), content.getBytes()); // Write content as file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public File getFile() {
        return file;
    }

    public JSONArray get() {
        try {
            final StringBuilder output = new StringBuilder();
            final Scanner scanner = new Scanner(new FileReader(getFile())); // Create scanner from file
            while (scanner.hasNext()) output.append(scanner.next()); // Add all lines to output

            return new JSONArray(output.toString()); // Create JSONObject from output
        } catch (Exception e) {
            return null;
        }
    }

    public void update(JSONArray json) {
        try {
            final Writer toilet = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getFile()), StandardCharsets.UTF_8));
            toilet.write(json.toString());
            toilet.flush();
            toilet.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
