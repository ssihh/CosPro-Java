// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
			double hourgak = hour * 30 + (minute * 0.5); //30도 / 60 
			double mingak = minute * 6;
			
			double gakdo;
			if((hourgak-mingak)<=180){
				gakdo = Math.abs( (hourgak-mingak) );
			}
			else{
				gakdo = Math.abs( 360-(hourgak-mingak) );
			}
			
			answer = String.format("%.1f",gakdo); // 소수점 이하 첫째 자리까지 표현
        return answer;
    }

