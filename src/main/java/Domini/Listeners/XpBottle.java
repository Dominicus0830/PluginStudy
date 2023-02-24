package Domini.Listeners;

import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpBottle implements Listener {
    //경험치병 이펙트 수정

    @EventHandler
    public void onXpBottleBreak(ExpBottleEvent e){
    //경험치병 이벤트을 e 라고 지정

        e.setShowEffect(false);
        //e 이벤트 취소
    }
}
