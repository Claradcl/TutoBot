package com.discordbot.Controler;

import org.jetbrains.annotations.NotNull;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EmoteReactControler extends ListenerAdapter {
    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event){
        String reaction = event.getReaction().getEmoji().getAsReactionCode();
        User userReacted = event.getUser();
        Channel channel = event.getChannel();
        String channelMention = channel.getAsMention();
        String jumpLink = event.getJumpUrl();
        String house = "nothing";
        System.out.println(reaction);
        if ( reaction.equals("\uD83D\uDE00")) {
            house = "Fidelity";
        } else if (reaction.equals("\uD83D\uDE01")) {
            house = "Curat";
        } else if (reaction.equals("\uD83D\uDE0D")) {
            house = "Amare";
        } else if (reaction.equals("\uD83D\uDE2D")){
            house = "Volo";
        }

        String message = userReacted.getName() + " you've been sorted into house " + house + " see here: " + jumpLink + " in " + channelMention;
        event.getGuild().getTextChannelById(channel.getId()).sendMessage(message).queue();
    }
}
