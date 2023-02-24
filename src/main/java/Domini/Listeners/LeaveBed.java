package Domini.Listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class LeaveBed implements Listener {
//플레이어가 침대에서 일어났을때 이벤트

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
    //플레이어가 침대에서 일어난 이벤트을 event라고 지정
        Player player = event.getPlayer();
        //이벤트을 실행한 플레이어을 변수 player에다가 저장

        double health = player.getHealth();
        //플레이어의 체력을 구함

        if(health<18){
        //만약에 체력이 18 이하 이라면

            player.setHealth(health+3);
            //플레이어 체력에서 체력3을 추가

        }else{
        //만약에 체력이 18 이상 이라면

            player.sendMessage("피가 18이상");
            //이벤트을 실행한 플레이어에게 메세지을 출력

        }
    }
}
