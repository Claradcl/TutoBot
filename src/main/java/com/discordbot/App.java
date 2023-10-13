package com.discordbot;

import com.discordbot.Model.TutoBot;

import net.dv8tion.jda.api.exceptions.InvalidTokenException;

public class App 
{
    public static void main( String[] args ) {
        try {
            TutoBot bot = new TutoBot();
            bot.tutoBot();
        } catch (InvalidTokenException e) {
            System.out.println("Error: Provided bot token is invalid!");
            System.out.println(e);
        }
    }
}
