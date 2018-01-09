package nl.daan.esperbot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import nl.daan.esperbot.listeners.DiscordChatListener;

public class Esperbot {
    public static void main(String[] args) {
        try {
            JDA jda = new JDABuilder(AccountType.BOT).setToken("MzY0Nzg4NjQwNzE2NTU0MjQw.DTZmSA.jk27OB6Ol7oWrchEMKR9qB_j9aM").buildBlocking();
            jda.addEventListener(new DiscordChatListener());
        } catch (Exception e) {

        }
        while(true) {

        }
    }
}
