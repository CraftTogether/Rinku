package com.github.crafttogether.rinku;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Rinku {

    public static Connection find(Predicate<Connection> filter) {
        final Optional<Connection> optional = retrieveAll().stream().filter(filter).findFirst();
        if (optional.isEmpty()) return null;
        else return optional.get();
    }

    public static List<Connection> retrieveAll() {
        final List<Connection> connections = new ArrayList<>();

        final JSONArray jsonArray = Connections.get();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject entry = jsonArray.getJSONObject(i);
            final Connection connection = new Connection(entry.getString("discord"), entry.getString("minecraft"));
            connections.add(connection);
        }

        return connections;
    }

    public static void remove(Connection connection) {
        final JSONArray array = Connections.get();

        for (int i = 0; i < array.length(); i++) {
            final JSONObject entry = array.getJSONObject(i);

            final Connection conn = new Connection(entry.getString("discord"), entry.getString("minecraft"));
            if (conn.equals(connection)) {
                array.remove(i);
            }

        }

        Connections.update(array);
    }

}
