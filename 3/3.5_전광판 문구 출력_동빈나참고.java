// 다음과 같이 import를 사용할 수 있습니다. 동빈나 참고
import java.util.*;

class Main {
    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
			for(int i=0; i<14; i++) answer += "_";  //어플은 화면에 14자 문구를 출력합니다.
			answer += phrases; //______________happy-birthday 28문자
			
			for(int i=0; i<second; i++){ //초만큼
				char first = answer.charAt(0); //첫번째 값 떼어서
				answer += first; //뒤에 붙여주고 | 그럼 지금 길이 29문자
				answer = answer.substring(1); //0번째 패스, 1부터 끝까지 다시 answer에 넣어 | 다시 28문자
			}

        return answer.substring(0,14);
    }
    
