package Lv_1;

import java.util.*;

class Solution14 { // 달리기 경주
    public String[] solution(String[] players, String[] callings) {
        HashMap<String , Integer> playersMap = new HashMap<>();

        for(int i=0; i<players.length; i++) playersMap.put(players[i] , i);

        for(int i=0; i<callings.length; i++){
            int ind = playersMap.get(callings[i]);
            players[ind] = players[ind-1];
            players[ind-1] = callings[i];

            playersMap.put(players[ind] , ind);
            playersMap.put(callings[i] , ind-1);
        }

        return players;
    }

}
