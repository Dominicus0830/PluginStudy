package Domini.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;


//양 양털 깍기 이벤트
public class ShearSheep implements Listener {

    @EventHandler
    public void ShearSheep(PlayerShearEntityEvent e){

        Player player =  e.getPlayer();
        //이벤트을 실행하는 플레이어을 구함

        Entity entity = e.getEntity();
        //이벤트을 당하는 엔티티을 구함

        if(entity.getType() == EntityType.SHEEP){
        //만약에 엔티티가 양이라면

            e.setCancelled(true);
            //e 이벤트 취소

            player.sendMessage("양도 추워!");
            //이벤트을 실행한 플레이어에게 메세지 출력

        }else{
        //만약에 양이 아니라면

            player.sendMessage("이건 양이 아니야!");
            //이벤트을 실행한 플레이어에게 메세지 출력
        }

    }
}
