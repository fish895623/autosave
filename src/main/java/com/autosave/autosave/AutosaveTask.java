package com.autosave.autosave;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class AutosaveTask extends BukkitRunnable {
    JavaPlugin plugin;

    public AutosaveTask(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        String command = "save-all";
        Bukkit.dispatchCommand(console, command);

        System.out.println("Auto saved");
    }
}
