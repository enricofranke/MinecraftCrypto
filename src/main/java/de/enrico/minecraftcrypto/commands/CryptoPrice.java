package de.enrico.minecraftcrypto.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static de.enrico.minecraftcrypto.rest.getCryptoCurrencys.getCurrency;

public class CryptoPrice implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     /*   if (!(cmd instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage("§cERROR");
            return false;

        }


      */
        Player player = (Player)sender;
        player.sendMessage("Test");
        System.out.println();
        // /crypto <Crypto>
        if (args.length == 1) {
            switch (args[0]) {
                case "Xrp":{
                    try {
                        player.sendMessage("Xrp: "+getCurrency("XRP"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    }
                    break;
                case "Btc":
                    player.sendMessage("Btc: ");
                    break;
                default:
                    break;
            }
        } else {
            player.sendMessage("§cUse /crypto <Xrp/Btc>");
        }
            return true;
    }

}
