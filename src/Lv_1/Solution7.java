package Lv_1;

public class Solution7 { // 문자열 나누기
    public int solution(String s) {
        int answer = 0;
        int diff = 0; // 다른 문자
        int same = 0; // 같은 문자
        int num = 0; // 첫 문자 초기화 인덱스 번호

        for(int i=0; i<s.length(); i++){
            char first = s.charAt(num);

            if(first == s.charAt(i)){
                same++;
            }else{
                diff++;
            }

            if(same == diff){
                answer++;
                num = i+1;
            }else if(i == s.length()-1) answer++; // 끝까지 조건에 맞지 않으면 +1 해준다
        }

        return answer;
    }
}
