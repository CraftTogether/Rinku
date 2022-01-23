package com.github.crafttogether.rinku.discord.commands;

import com.github.crafttogether.rinku.Connection;
import com.github.crafttogether.rinku.Rinku;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class UnlinkCommand extends ListenerAdapter {

    public void onSlashCommand(SlashCommandEvent event) {
        if (event.getName().equals("unlink")) {
            final Connection connection = Rinku.find(c -> c.getDiscord().equals(event.getUser().getId()));

            if (connection == null) {
                event.reply("You haven't linked up your account yet. To link your discord account to your minecraft account, use /link.")
                        .setEphemeral(true)
                        .queue();
            } else {
                Rinku.remove(connection);
                event.reply("Successfully unlinked your discord connection! To link your discord account back again to your minecraft account, use the command /link in Discord.")
                        .setEphemeral(true)
                        .queue();
            }

        }
    }

}
