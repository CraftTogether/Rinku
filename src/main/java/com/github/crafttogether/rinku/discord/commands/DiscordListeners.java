package com.github.crafttogether.rinku.discord.commands;

import com.github.crafttogether.kelp.Kelp;

public class DiscordListeners {

    public static void register() {
        Kelp.addListeners(new LinkCommand());
    }

}
