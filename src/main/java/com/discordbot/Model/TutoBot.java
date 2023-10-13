package com.discordbot.Model;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.exceptions.InvalidTokenException;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

public class TutoBot {
    
    private ShardManager shardManager;
    private Dotenv config;

    public ShardManager getShardManager() {
        return shardManager;
    }

    public Dotenv getConfig() {
        return config;
    }

    public void tutoBot() throws InvalidTokenException {
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");
        DefaultShardManagerBuilder botBuilder = DefaultShardManagerBuilder.createDefault(token);
        botBuilder.setStatus(OnlineStatus.IDLE);
        botBuilder.setActivity(Activity.listening("Hating Madrid"));
        shardManager = botBuilder.build();
    }

}
