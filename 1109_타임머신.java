// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public long solution(long num) {
        
        long answer = num+=1;
				String s = Long.toString(num); //long->String형변환
			  //System.out.print(s.replace("0", "1"));
				answer=Long.parseLong(s.replace("0", "1")); // 0인거 1로 변환 replace
        return answer;
    }
// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        long num = 9949999;
        long ret = sol.solution(num);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
