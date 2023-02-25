package Domini;

import Domini.Command.CommandArg;
import Domini.Listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main plugin;
    //클라스 Main을 plugin 이라고 지정

    @Override
    public void onEnable() {
    //서버가 켜질때

        plugin = this;
        //plugin을 Main클라스로 지정

        getCommand("test").setExecutor(new CommandArg());

        plugin.getServer().getPluginManager().registerEvents(new PlayerJoinLeave(), this);
        plugin.getServer().getPluginManager().registerEvents(new XpBottle(), this);
        plugin.getServer().getPluginManager().registerEvents(new LeaveBed(), this);
        plugin.getServer().getPluginManager().registerEvents(new ShearSheep(), this);
        plugin.getServer().getPluginManager().registerEvents(new PlayerReJoin(), this);
        //이벤트을 불러오기

    }
}