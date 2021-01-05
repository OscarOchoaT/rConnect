package us.rojo.rconnect.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class KBCommand extends Command {

    public KBCommand() {
        super("kbffa");
    }


    @Override
    public void execute(CommandSender sender, String[] args) {
        if (!(sender instanceof ProxiedPlayer)) {
            sender.sendMessage(new ComponentBuilder("[rConnect] This command can only be run by a player!").color(ChatColor.RED).create());
            return;
        }
        ProxiedPlayer player = (ProxiedPlayer) sender;

        if (player.getServer().getInfo().getName().equalsIgnoreCase("kbffa")) {
            player.sendMessage(new ComponentBuilder("Ya estas conectado en KnockbackFFA!").color(ChatColor.AQUA).create());

        } else {
            ServerInfo target = ProxyServer.getInstance().getServerInfo("Kbffa");
            player.connect(target);
        }
    }
}
