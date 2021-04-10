package com.jackwalmsley.gms;

import org.bukkit.plugin.java.JavaPlugin;

public class GamemodeShortcuts extends JavaPlugin{
    @Override
    public void onEnable() {
        this.getCommand("gmc").setExecutor(new CommandGamemode());
        this.getCommand("gms").setExecutor(new CommandGamemode());
        this.getCommand("gma").setExecutor(new CommandGamemode());
    }

    @Override
    public void onDisable() {

    }
}

