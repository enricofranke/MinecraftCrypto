package de.enrico.minecraftcrypto;

import de.enrico.minecraftcrypto.commands.CryptoPrice;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftCrypto extends JavaPlugin {

    @Override
    public void onEnable() {
        onInit();
    }

    @Override
    public void onDisable() {

    }

    private void onInit() {
        this.getCommand("crypto").setExecutor(new CryptoPrice());
    }
}
