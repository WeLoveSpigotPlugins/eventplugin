package net.welovespigotplugins.event.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

/**
 * JavaDoc this file!
 * Created: 03.10.2019
 *
 * @author WeLoveSpigotPlugins (welovespigotplugins@gmail.com)
 */
public class EventCommand extends Command {


    public EventCommand(String name) {
        super(name);
    }

    public void execute(CommandSender commandSender, String[] args) {

        if(!commandSender.hasPermission("event.execeute")) {
            commandSender.sendMessage("");
        }

    }

}
