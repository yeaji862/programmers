package Lv_1;
import java.util.*;

class Solution6 { // 완주하지 못 한 선수
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String , Integer> par = new HashMap<>();
        HashMap<String , Integer> com = new HashMap<>();
        ArrayList<String> sameName = new ArrayList<>();

        for(int i=0; i<completion.length; i++){
            if(com.get(completion[i]) == null){
                com.put(completion[i] , 1);
            }else{
                com.put(completion[i] , com.get(completion[i]) + 1);
            }
        }

        for(int i=0; i<participant.length; i++){
            if(par.get(participant[i]) == null){
                par.put(participant[i] , 1);
            }else{
                par.put(participant[i] , par.get(participant[i]) + 1);
                sameName.add(participant[i]);
            }
        }

        for(int i=0; i<participant.length; i++){ // 완주하지 못 한 사람이 동명이인이 아닐 때
            if(com.get(participant[i]) == null) answer = participant[i];
        }

        if(answer.equals("")){ // 완주하지 못 한 사람이 동명이인 일 때
            for(int i=0; i<sameName.size(); i++){
                if(par.get(sameName.get(i)) > com.get(sameName.get(i))) answer = sameName.get(i);
            }
        }

        return answer;
    }

}
