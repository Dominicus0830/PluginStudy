package Domini.Command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandArg implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (args.length == 0) {
            sender.sendMessage("§cUsage: /test 테스트 ");
            return false;
        }


        if (args[0].equalsIgnoreCase("테스트")){
        //만약에 커맨드 이름이 test 라면
        //*주의 plugin.yml 에 명령어 등록해야함

            if(sender instanceof Player){
            //만약에 전송자가 플레이어일 경우

                Player p = (Player) sender;
                //전송자 플레이어을 p로 지정

                p.setHealth(0.1);
                //피을 0.1로 지정

                p.sendMessage(ChatColor.RED+""+ChatColor.BOLD+"피1 처럼 보이지만 사실은 0.1");
                //명령어 전송자에게 메세지 출력

            }
        }
        return true;
    }
}
