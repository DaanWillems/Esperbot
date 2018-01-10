package nl.daan.esperbot.util;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.*;

public class DiscordUtil {

    public static JDA jda;
    public static TextChannel mainChannel;

    public static void sendMessage(String playerName, String m) {
        Message message = new MessageBuilder(playerName+": "+m).append("").build();
        mainChannel.sendMessage(message).queue();
    }

    public static void disconnect() {
        jda.shutdownNow();
    }
}
