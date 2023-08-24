package Lv_1;

class Solution15 { // 공원산책
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int hMax = park.length - 1; // 최대 세로 길이
        int wMax = park[0].length() - 1; // 최대 가로 길이
        int hNow = 0;
        int wNow = 0;

        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){// 시작 위치 찾기
                hNow = i;
                wNow = park[i].indexOf("S");
            }
        }

        for(int i=0; i<routes.length; i++){
            boolean bo = false;
            String str = "";
            String dir = routes[i].substring(0 , 1);
            int num = (dir.equals("W") || dir.equals("N")) ?
                    -(Integer.valueOf(routes[i].substring(2))) : Integer.valueOf(routes[i].substring(2));

            for(int j=1; j<=Math.abs(num); j++){
                bo = false;

                if((dir.equals("N") || dir.equals("S")) &&  hNow+num <= hMax && hNow+num >= 0){

                    if(dir.equals("N")){
                        bo = (park[hNow - j].charAt(wNow) == 'X') ? false : true;
                    }
                    if(dir.equals("S")){
                        bo = (park[hNow + j].charAt(wNow) == 'X') ? false : true;
                    }
                }

                if((dir.equals("W") || dir.equals("E")) &&  wNow+num <= wMax && wNow+num >= 0){

                    if(dir.equals("W")){
                        bo = (park[hNow].charAt(wNow - j) == 'X') ? false : true;
                    }
                    if(dir.equals("E")){
                        bo = (park[hNow].charAt(wNow + j) == 'X') ? false : true;
                    }
                }

                if(!bo) break;
            }
            //System.out.println(bo);
            if(bo){
                if(dir.equals("N") || dir.equals("S")) hNow += num;
                if(dir.equals("E") || dir.equals("W")) wNow += num;
            }
        }

        answer[0] = hNow;
        answer[1] = wNow;

        return answer;
    }
}
