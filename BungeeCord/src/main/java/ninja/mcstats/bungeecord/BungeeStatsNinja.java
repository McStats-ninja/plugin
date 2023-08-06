package ninja.mcstats.bungeecord;

import net.md_5.bungee.api.plugin.Plugin;
import ninja.mcstats.api.McStatsNinja;

public class BungeeStatsNinja extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("BungeeStatsNinja enabled!");

        McStatsNinja.init("BungeeCord");
    }

    @Override
    public void onDisable() {
        System.out.println("BungeeStatsNinja disabled!");
    }
}
