package com.ismaeelakram.minecrafter.main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDA jda;

    public static final String token = "NzIxODc0NTQ4Njk3NTk1OTQ0.Xua4aA.JFHg1Paq6YgFS3eMpVIe4lQALK4";
    public static final String prefix = ".";

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder().setToken(token).setActivity(Activity.playing("Minecraft")).build();

        CommandListener commandListener = new CommandListener();
        commandListener.InitCommands();

        jda.addEventListener(commandListener);
    }

}