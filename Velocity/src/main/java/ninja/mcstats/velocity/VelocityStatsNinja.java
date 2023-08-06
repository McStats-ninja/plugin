package ninja.mcstats.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import ninja.mcstats.api.McStatsNinja;
import org.slf4j.Logger;

@Plugin(id = "mcstatsninja", name = "MCStatsNinja", version = "1.0", authors = {"Freddi"}, url = "https://mcstats.ninja", description = "MCStatsNinja plugin for Velocity")
public class VelocityStatsNinja {


    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public VelocityStatsNinja(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onInit(ProxyInitializeEvent event) {
        McStatsNinja.init("TEST");
    }


}
