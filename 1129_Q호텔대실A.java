//풀이: https://velog.io/@qodlstjd12/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%98%B8%ED%85%94-%EB%8C%80%EC%8B%A4-java

import java.util.*; 

class Solution {

    //시간문자열을 분으로 변환하는 함수
    public int toMinute(String time, boolean isEnd){ 
        int mint = Integer.parseInt(time.substring(0,2))*60
                    + Integer.parseInt(time.substring(3,5));
        if(isEnd){
            mint +=9; //퇴실시간은 9분 더함. 청소시간 10분
        }
        return mint;
    }

    
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] room = new int[1449];
        for(int i=0;i<book_time.length; i++){
            int sta = toMinute(book_time[i][0], false);
            int end = toMinute(book_time[i][1], true);
            for(int j=sta; j<=end; j++){
                room[j]++;
            }
        }
        
        Arrays.sort(room); //Arrays.sort(arr)쓰려면 class 보다 상위에 import 필요
        answer=room[1448];
            
        return answer;
    }
}
