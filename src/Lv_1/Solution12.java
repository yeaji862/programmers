package Lv_1;

public class Solution12 { // 바탕화면 정리
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[1] = 50;

        for(int i = 0; i<wallpaper.length; i++){

            if(wallpaper[i].contains("#")){
                answer[1] = Math.min(wallpaper[i].indexOf("#") , answer[1]);
                answer[2] = i+1;
                answer[3] = Math.max(wallpaper[i].lastIndexOf("#")+1 , answer[3]);
            }else{
                answer[0] = (answer[3] == 0) ? answer[0] + 1 : answer[0];
            }
        }

        return answer;
    }
}
