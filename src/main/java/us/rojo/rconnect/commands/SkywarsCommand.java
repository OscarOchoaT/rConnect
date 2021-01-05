package us.rojo.rconnect.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class SkywarsCommand extends Command {

    public  SkywarsCommand() {
        super("skywars");
    }

    @Override
    public void execute(CommandSender commandSender, String [] strings) {
        if (!(commandSender instanceof ProxiedPlayer)) {
            commandSender.sendMessage(new ComponentBuilder("[rConnect] This command can only be run by a player!").color(ChatColor.RED).create());
            return;
        }
        ProxiedPlayer player = (ProxiedPlayer) commandSender;

        if (player.getServer().getInfo().getName().equalsIgnoreCase("skywars")) {
            player.sendMessage(new ComponentBuilder("Ya estas conectado en skywars!").color(ChatColor.AQUA).create());
        } else {
            ServerInfo target = ProxyServer.getInstance().getServerInfo("Skywars");
            player.connect(target);
        }
    }
}
