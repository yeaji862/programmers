package Lv_1;

import java.util.*;
import java.text.*;

class Solution13 { // 개인정보 수집 유효기간
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String,Integer> termsMap = new HashMap<>();
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd");

        for(String str : terms){
            termsMap.put(str.substring(0 , str.indexOf(" ")) ,
                    Integer.valueOf(str.substring(2 , str.length())));
        }

        for(int i=0; i<privacies.length; i++){
            int year = Integer.valueOf(privacies[i].substring(0,4));
            int month = Integer.valueOf(privacies[i].substring(5,7));
            int day = Integer.valueOf(privacies[i].substring(8,10)) - 1;

            month += termsMap.get(privacies[i].substring(11));

            if(month > 12){
                year += month / 12;
                month = month % 12;
            }

            if(day == 0){
                month--;
                day = 28;
            }

            try{
                Date dPrivacies = df.parse(year+"."+month+"."+day);
                Date dToday = df.parse(today);

                if(dToday.compareTo(dPrivacies) > 0) list.add(i+1);

            }catch(Exception e){

            }

        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
