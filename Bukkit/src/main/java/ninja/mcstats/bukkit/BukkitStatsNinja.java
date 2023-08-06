package ninja.mcstats.bukkit;

import ninja.mcstats.api.McStatsNinja;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitStatsNinja extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("BukkitStatsNinja enabled!");
        McStatsNinja.init("TEST");
    }

}
