package com.autosave.autosave;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Autosave extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("Autosave loaded");
        BukkitTask AutosaveTask = new AutosaveTask(this).runTaskLater(this, 12000L);
    }

    @Override
    public void onDisable() {
    }
}