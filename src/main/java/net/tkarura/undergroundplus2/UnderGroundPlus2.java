package net.tkarura.undergroundplus2;

import org.bukkit.plugin.java.JavaPlugin;

public final class UnderGroundPlus2 extends JavaPlugin {

    private static UnderGroundPlus2 instance;

    @Override
    public void onEnable() {

	instance = this;
	
	this.getLogger().info("plugin has enable.");

    }

    @Override
    public void onDisable() {

	this.getLogger().info("plugin has disabled.");
	
    }

}
