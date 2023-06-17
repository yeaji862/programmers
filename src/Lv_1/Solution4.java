package Lv_1;

public class Solution4 { // 옹알이2
        public int solution(String[] babbling) {
            int answer = 0;
            String[] str = {"aya" , "ye" , "woo" , "ma"}; // 가능한 발음

            for(int i=0; i<babbling.length; i++){

                for(int j=0; j<str.length; j++){
                    babbling[i] = babbling[i].replace(str[j] , String.valueOf(j)); // babbling 배열에 가능한 발음과 일치하는 발음은 번호로 치환
                }

            }

            for(int i=0; i<babbling.length; i++){
                for(int j=1; j<babbling[i].length(); j++){
                    if(babbling[i].charAt(j-1) == babbling[i].charAt(j)){ // 연속되는 발음은 할 수 없기에 연속되는 발음(치환한 번호)이 있는지 확인
                        babbling[i] = "***"; // 확인 후 replace 되지 않도록 문자열 *** 로 변환
                    }
                }
                babbling[i] = babbling[i].replace("0" , "");
                babbling[i] = babbling[i].replace("1" , "");
                babbling[i] = babbling[i].replace("2" , "");
                babbling[i] = babbling[i].replace("3" , "");

                if(babbling[i].length() == 0) answer += 1; // 가능한 발음의 조합들일 경우 문자열 갯수가 0임 만약 갯수가 0이면 answer 값 1 증가

            }

            return answer;
        }
    }
