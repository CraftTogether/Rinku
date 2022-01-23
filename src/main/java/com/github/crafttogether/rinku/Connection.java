package com.github.crafttogether.rinku;

public class Connection {

    private String discord;
    private String minecraft;

    public Connection(String discord, String minecraft) {
        this.discord = discord;
        this.minecraft = minecraft;
    }

    public String getDiscord() {
        return this.discord;
    }

    public String getMinecraft() {
        return this.minecraft;
    }
}
