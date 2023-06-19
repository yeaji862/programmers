package Lv_1;
import java.util.*;

    class Solution5 { // 체육복
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n-lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve); // lost , reserve 배열의 순서를 오름차순으로 정리해준다

            for(int i=0; i<lost.length; i++){ // 체육복을 잃어버린 학생 중 여벌의 체육복이 있는 학생을 구하고 answer 의 값을 1 증가시킨다
                for(int j=0; j<reserve.length; j++){

                    if(lost[i] == reserve[j]){
                        reserve[j] = -1;
                        lost[i] = -1;
                        answer++;
                        break;
                    }
                }
            }

            for(int i=0; i<lost.length; i++){ // 체육복을 잃어버린 학생 중 본인 사이즈에 맞는 체육복을 빌릴 수 있으면 answer 의 값을 1 증가시킨다
                for(int j=0; j<reserve.length; j++){

                    if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }


            return answer;
        }
    }

