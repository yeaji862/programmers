package Lv_1;
import java.util.*;
public class Solution8 { // 크레인 인형뽑기 게임

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<moves.length; i++){

            for(int j=0; j<board.length; j++){

                if(board[j][moves[i]-1] != 0){
                    arr.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }

            }

            for(int p=1; p<arr.size(); p++){ // 순차대로 인형을 뽑아 넣고 연속되는 인형이 있으면 제거 시킨다
                if(arr.get(p-1) == arr.get(p)){
                    arr.remove(p-1);
                    arr.remove(p-1);
                    answer += 2;
                }
            }

        }

        return answer;
    }

}
