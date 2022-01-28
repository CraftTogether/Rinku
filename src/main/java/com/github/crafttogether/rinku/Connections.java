package com.github.crafttogether.rinku;

import org.json.JSONArray;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Connections {

    private File file;
    private String path = Plugin.getInstance().getDataFolder() + "/connections.json";

    public Connections() {
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                final String content = "[]"; // Create initial json
                Files.write(Path.of(path), content.getBytes()); // Write content as file
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public File getFile() {
        return file;
    }

    public JSONArray get() {
        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = input.readLine()) != null) builder.append(line);
            return new JSONArray(builder.toString()); // Create JSONObject from output
        } catch (Exception e) {
            return new JSONArray();
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
