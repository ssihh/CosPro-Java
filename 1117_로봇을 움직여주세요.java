// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int[] solution(String commands) {
			int[] answer = new int[2];
			int x = 0, y = 0, i = 0;
			while(i < commands.length()) { //4
				switch(commands.substring(i, i+1)) { //substring(i,i+1):문자열자르기
					case "U" : y++; break; //while { switch { case "": ; break;} i++; }
					case "D" : y--; break;
					case "L" : x--; break;
					case "R" : x++; break;
				}
				i++;
			}

			answer[0] = x; answer[1] = y; 
			return answer;
    }
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
  
