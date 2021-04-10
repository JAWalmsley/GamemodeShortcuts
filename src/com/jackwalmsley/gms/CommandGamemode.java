package com.jackwalmsley.gms;

import org.bukkit.GameMode;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandGamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getLabel().equalsIgnoreCase("gmc")) {
                player.setGameMode(GameMode.CREATIVE);
            } else if (command.getLabel().equalsIgnoreCase("gms")) {
                player.setGameMode(GameMode.SURVIVAL);
            } else if (command.getLabel().equalsIgnoreCase("gma")) {
                player.setGameMode(GameMode.ADVENTURE);
            }
            return true;
        }
        return false;
    }
}
