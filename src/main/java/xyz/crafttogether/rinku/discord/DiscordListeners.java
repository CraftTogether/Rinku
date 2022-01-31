package xyz.crafttogether.rinku.discord;

import xyz.crafttogether.kelp.Kelp;
import xyz.crafttogether.rinku.discord.commands.LinkCommand;
import xyz.crafttogether.rinku.discord.commands.UnlinkCommand;

public class DiscordListeners {

    public static void register() {
        Kelp.addListeners(
                new LinkCommand(),
                new UnlinkCommand());
    }

}
