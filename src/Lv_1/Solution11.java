package Lv_1;

import java.util.HashMap;

public class Solution11 { // 성격 유형 검사하기

    public String solution(String[] survey, int[] choices) {

        String answer = "";
        HashMap<String , Integer> map = new HashMap<>();

        map.put("R" , 0);map.put("T" , 0);map.put("C" , 0);
        map.put("F" , 0);map.put("J" , 0);map.put("M" , 0);
        map.put("A" , 0);map.put("N" , 0);

        for(int i=0; i<survey.length; i++){
            String first = String.valueOf(survey[i].charAt(0));
            String last = String.valueOf(survey[i].charAt(1));
            if(choices[i] < 4){
                map.put(first, map.get(first) + Math.abs(choices[i] - 4));
            }else{
                map.put(last, map.get(last) + Math.abs(choices[i] - 4));
            }
        }

        answer = (map.get("R") >= map.get("T")) ? answer + "R" : answer + "T";
        answer = (map.get("C") >= map.get("F")) ? answer + "C" : answer + "F";
        answer = (map.get("J") >= map.get("M")) ? answer + "J" : answer + "M";
        answer = (map.get("A") >= map.get("N")) ? answer + "A" : answer + "N";

        return answer;

    }

}
