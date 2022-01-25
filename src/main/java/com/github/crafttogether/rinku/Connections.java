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
        try {
            final StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }

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
