package nl.daan.esperbot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import nl.daan.esperbot.listeners.DiscordChatListener;
import nl.daan.esperbot.listeners.McChatEvent;
import nl.daan.esperbot.listeners.McPlayerJoinEvent;
import nl.daan.esperbot.listeners.McPlayerQuitEvent;
import nl.daan.esperbot.util.DiscordUtil;
import org.bukkit.plugin.java.JavaPlugin;

public class Esperbot extends JavaPlugin {

    @Override
    public void onEnable(){
        try {
            JDA jda = new JDABuilder(AccountType.BOT).setToken("MzY0Nzg4NjQwNzE2NTU0MjQw.DTZmSA.jk27OB6Ol7oWrchEMKR9qB_j9aM").buildBlocking();
            jda.addEventListener(new DiscordChatListener());
            DiscordUtil.mainChannel = jda.getTextChannelById("400308836440735755");
            DiscordUtil.jda = jda;
        } catch (Exception e) {

        }
        getServer().getPluginManager().registerEvents(new McChatEvent(), this);
        getServer().getPluginManager().registerEvents(new McPlayerJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new McPlayerQuitEvent(), this);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
        DiscordUtil.disconnect();
    }
}
