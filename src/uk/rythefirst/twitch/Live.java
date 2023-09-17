package uk.rythefirst.twitch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Live implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (TwitchAPI.live() == true) {

			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.DARK_PURPLE + Main.twitchname + " is live!");
				return true;
			}

			Player p = (Player) sender;

			Messages.sendCenteredMessage(p, "");
			Messages.sendCenteredMessage(p, "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + Main.servername);
			Messages.sendCenteredMessage(p, "");
			Messages.sendCenteredMessage(p, ChatColor.DARK_PURPLE + Main.twitchname + " is live!");
			Messages.sendCenteredMessage(p, ChatColor.DARK_PURPLE + "Watch: https://www.twitch.tv/" + Main.twitchname);
			Messages.sendCenteredMessage(p, "");

		} else {

			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.DARK_PURPLE + "Nihachu is currently offline D:");
				return true;
			}

			Player p = (Player) sender;

			Messages.sendCenteredMessage(p, "");
			Messages.sendCenteredMessage(p, "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + Main.servername);
			Messages.sendCenteredMessage(p, "");
			Messages.sendCenteredMessage(p, ChatColor.DARK_PURPLE + Main.twitchname + " is Currently Offline D:");
			Messages.sendCenteredMessage(p, "");
		}

		return true;
	}

}
