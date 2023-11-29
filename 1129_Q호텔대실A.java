//풀이: https://velog.io/@qodlstjd12/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%98%B8%ED%85%94-%EB%8C%80%EC%8B%A4-java

class Solution {
    
    //시간을 분으로 표현해주는 함수 선언
    public int timeToInteger(String time, boolean isEnd) {  
        int res = Integer.parseInt(time.substring(0,2)) * 60 
                  + Integer.parseInt(time.substring(3,5));
        if(isEnd) 
            res += 9; //퇴실엔 청소시간 9분 더해조
        return res;
    }
    
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] rooms = new int[1449];

        for(int i = 0; i < book_time.length; i++) {
            int staT = timeToInteger(book_time[i][0], false);
            int endT = timeToInteger(book_time[i][1], true);
            //시작시간부터 퇴실시간까지 room 분마다 +1
            for(int j = staT; j <= endT; rooms[j++]++); 
        }
        for(int i = 0; i < rooms.length; i++) {
            if(answer < rooms[i])
                answer = rooms[i];
        }
        return answer;
    }
}
