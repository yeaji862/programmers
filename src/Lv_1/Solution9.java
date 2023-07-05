package Lv_1;

public class Solution9 { // 대충 만든 자판
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            for(int i=0; i<targets.length; i++){

                for(int j=0; j<targets[i].length(); j++){
                    int small = 101;
                    for(int p=0; p<keymap.length; p++){
                        int ind = keymap[p].indexOf(targets[i].charAt(j))+1;
                        if(small > ind && ind != 0) {
                            small = ind;
                        }
                    }

                    if(small == 101){ // 키보드로 입력 할 수 없으면 -1 을 반환한다
                        answer[i] = -1;
                        break;
                    }else{
                        answer[i] += small;
                    }
                }
            }

            return answer;
        }

}
