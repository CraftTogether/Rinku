package com.github.crafttogether.rinku.discord;

import com.github.crafttogether.kelp.Kelp;
import com.github.crafttogether.rinku.discord.commands.LinkCommand;
import com.github.crafttogether.rinku.discord.commands.UnlinkCommand;

public class DiscordListeners {

    public static void register() {
        Kelp.addListeners(
                new LinkCommand(),
                new UnlinkCommand());
    }

}
