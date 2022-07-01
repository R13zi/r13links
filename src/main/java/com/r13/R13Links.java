package com.r13;

import com.google.errorprone.annotations.Var;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class R13Links extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (command.getName().equals("discord")) {
            Player p = (Player) sender;
            if (p.hasPermission("R13Links.discord")) {
                String discord = getConfig().getString("Discord");
                p.sendMessage("");
                p.sendMessage(ChatColor.BLUE + "Discord: " + ChatColor.WHITE + discord);
                p.sendMessage("");
            }
        }
        if (command.getName().equals("site")) {
            Player p = (Player) sender;
            if (p.hasPermission("R13Links.site")) {
                String site = getConfig().getString("Site");
                p.sendMessage("");
                p.sendMessage(ChatColor.RED + "Site: " + ChatColor.WHITE + site);
                p.sendMessage("");
            }
        }
        if (command.getName().equals("loja")) {
            Player p = (Player) sender;
            if (p.hasPermission("R13Links.loja")) {
                String loja = getConfig().getString("Loja");
                p.sendMessage("");
                p.sendMessage(ChatColor.LIGHT_PURPLE + "Loja: " + ChatColor.WHITE + loja);
                p.sendMessage("");
            }
        }
        if (command.getName().equals("votar")) {
            Player p = (Player) sender;
            if (p.hasPermission("R13Links.votar")) {
                String votar = getConfig().getString("Votar");
                p.sendMessage(" ");
                p.sendMessage(ChatColor.GREEN + "Votos: " + ChatColor.WHITE + votar);
                p.sendMessage("");
            }
        }
        if (command.getName().equals("twitch")) {
            Player p = (Player) sender;
            if (p.hasPermission("R13Links.twitch")) {
                String twitch = getConfig().getString("Twitch");
                p.sendMessage(" ");
                p.sendMessage(ChatColor.DARK_PURPLE + "Twitch: " + ChatColor.WHITE + twitch);
                p.sendMessage("");
            }
        }
        return false;
    }
}

