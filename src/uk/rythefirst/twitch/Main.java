package uk.rythefirst.twitch;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static String twitchname;

	public static String servername;

	private static TwitchAPI tapi;

	public static Plugin instance;

	@Override
	public void onEnable() {
		this.saveDefaultConfig();

		servername = this.getConfig().getString("server-name");

		twitchname = this.getConfig().getString("twitch-name");

		instance = this;

		this.getCommand("live").setExecutor(new Live());
		this.getCommand("twitch").setExecutor(new Live());

		tapi = new TwitchAPI();

		tapi.StartWatcher();

	}

}
