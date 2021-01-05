package us.rojo.rconnect;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;
import us.rojo.rconnect.commands.HubCommand;
import us.rojo.rconnect.commands.KBCommand;
import us.rojo.rconnect.commands.SkywarsCommand;

public final class rConnect extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GRAY + "-----------------------");
        getLogger().info(ChatColor.AQUA + "Name: " + ChatColor.BLUE + "rConnect");
        getLogger().info(ChatColor.AQUA + "Author: " + ChatColor.BLUE + "R0JO");
        getLogger().info(ChatColor.AQUA + "Version: " + ChatColor.BLUE + "1.0");
        getLogger().info(ChatColor.GRAY + "-----------------------");
        getProxy().getPluginManager().registerCommand(this, new SkywarsCommand());
        getProxy().getPluginManager().registerCommand(this, new HubCommand());
        getProxy().getPluginManager().registerCommand(this, new KBCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "has been stopped");
    }
}
