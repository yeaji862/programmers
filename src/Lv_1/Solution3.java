package Lv_1;

public class Solution3 {

    public static void main(String[] args) { // 기사단원의 문제

        long startTime = System.currentTimeMillis();

        // 메소드 호출 및 처리
        solution(200000,100,100);

        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime) / 1000;
        System.out.println("처리 시간: " + executionTime + " 초");

    }
        public static int solution(int number, int limit, int power) {
            int answer = 0;
            int[] arr = new int[number];

            for(int i=1; i<=number; i++){
//                 for(int j=1; j<=i; j++){ // 처음에 시도했던 약수 구하는 알고리즘
//                     if(i%j == 0){
//                         arr[i-1] += 1;
//                     }
//                 }
                for(int j=1; j*j<=i; j++){ // 타임오버로 인한 수정 number을 200000 으로 설정하여 비교하였을 때 대략 23초 차이가 난다
                    if(j * j == i){
                        arr[i-1]++;
                    }else if(i%j == 0){
                        arr[i-1] += 2;
                    }
                }

            }

            for(int i=0; i<arr.length; i++){

                if(arr[i] <= limit){
                    answer += arr[i];
                }else {
                    answer += power;
                }

            }

            return answer;
        }


}
