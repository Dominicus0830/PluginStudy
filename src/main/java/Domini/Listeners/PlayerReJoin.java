package Domini.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerReJoin implements Listener {
    @EventHandler
    public void onRejoin(PlayerJoinEvent event){
        //플레이어가 서버에 접속했을때의 이벤트을 event라고 지정

        Player player = event.getPlayer();
        //이벤트을 실행한 플레이어을 변수 player 에다가 저장

        String playern = player.getDisplayName();
        //이벤트을 실행한 플레이어의 이름을 변수 playern에 저장
        //이건 이해하기 쉽게 변수 형태로 만든것이다, 굳이 귀찮게 이렇게 일일히 적을필요가 없다

        if(player.hasPlayedBefore()){
            //만약에 이벤트을 실행한 플레이어가 이전에 접속한 기록이 있다면

            player.sendMessage(ChatColor.YELLOW+""+ChatColor.BOLD+"돌아오신것을 환영해요!"+playern+"님");
            //이벤트가 발생 했을때 재입장 메세지을 설정후 출력
            //ChatColor로 채팅을 이쁘게 꾸밀수도 있다 (BOLD는 글씨을 굵게)
            //자바을 기본적으로 배운 사람이라면 알겠지만 앞에 혹은 뒤에다가 변수값을 넣고 싶다면 "+" 을 넣어야한다
            //playern은 player.getDisplayName() 으로 대체 가능하다
        }
    }
}
