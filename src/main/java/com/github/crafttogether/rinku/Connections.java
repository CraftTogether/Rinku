package com.github.crafttogether.rinku;

import org.json.JSONArray;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Connections {

    private File file;

    public Connections() throws IOException {
        file = new File(Plugin.getInstance().getDataFolder() + "/connections.json");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public File getFile() {
        return file;
    }

    private static void loadFile() {
        try {
            // Config file doesn't exist
            if (!getFile().exists()) {
                final String content = "[]"; // Create initial json
                Files.write(Paths.get(getFile().getPath()), content.getBytes()); // Write content as file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONArray get() {
        try {
            loadFile();

            final StringBuilder output = new StringBuilder();
            final Scanner scanner = new Scanner(new FileReader(getFile())); // Create scanner from file
            while (scanner.hasNext()) output.append(scanner.next()); // Add all lines to output

            return new JSONArray(output.toString()); // Create JSONObject from output
        } catch (Exception e) {
            return null;
        }
    }

    public static void update(JSONArray json) {
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
