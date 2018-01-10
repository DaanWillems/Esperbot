package nl.daan.esperbot.listeners;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import nl.daan.esperbot.util.DiscordUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class DiscordChatListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (!event.isFromType(ChannelType.PRIVATE) && !event.getAuthor().isBot() && event.getTextChannel().getId().equals(DiscordUtil.mainChannel.getId()))
        {
            Bukkit.broadcastMessage(ChatColor.AQUA+"(Discord) "+ChatColor.WHITE+"<"+event.getMember().getEffectiveName()+"> "+event.getMessage().getContentDisplay());
        }
    }
}
