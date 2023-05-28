package Lv_1;
import java.util.*;

class Solution2 { // 추억점수
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap map = new HashMap();

        for(int i=0; i<name.length; i++){
            map.put(name[i] , yearning[i]);
        }

        for(int i=0; i<photo.length; i++){
            int number = 0;
            for(int j=0; j<photo[i].length; j++){

                if(map.containsKey(photo[i][j])){
                    number += (int) map.get(photo[i][j]);
                }

            }

            answer[i] = number;

        }

        return answer;
    }
}
