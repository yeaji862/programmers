package Lv_1;

public class Solution10 { // 키패드 누르기
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] now = {10 , 12}; // 왼쪽 오른쪽 초기 위치 *=10 0=11 #=12

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 0) numbers[i] = 11;

            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                now[0] = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                now[1] = numbers[i];
            }else{
                int L = (Math.abs(numbers[i] - now[0]) / 3) + (Math.abs(numbers[i] - now[0]) % 3);
                int R = (Math.abs(numbers[i] - now[1]) / 3) + (Math.abs(numbers[i] - now[1]) % 3);

                if(L < R){
                    answer += "L";
                    now[0] = numbers[i];
                }else if(L > R){
                    answer += "R";
                    now[1] = numbers[i];
                }else if(L == R && hand.equals("left")){
                    answer += "L";
                    now[0] = numbers[i];
                }else if(L == R && hand.equals("right")){
                    answer += "R";
                    now[1] = numbers[i];
                }
            }

        }

        return answer;
    }

}
