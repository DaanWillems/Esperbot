package nl.daan.esperbot.listeners;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class DiscordChatListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.isFromType(ChannelType.PRIVATE))
        {
            System.out.printf("[PM] %s: %s\n", event.getAuthor().getName(),
                    event.getMessage().getContentDisplay());
        }
        else {
            Message m = new MessageBuilder().append(String.format("[%s]: %s\n", event.getMember().getEffectiveName(),
                    event.getMessage().getContentDisplay())).build();
            event.getTextChannel().sendMessage(m).complete();
        }
    }
}
