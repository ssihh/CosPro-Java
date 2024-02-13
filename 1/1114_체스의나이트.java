// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public int solution(String pos) {        
	int a= 8-(pos.charAt(1)-'0'); //7 .1
	int b= pos.charAt(0)-'A'; //A .0
	// System.out.println(a);System.out.println(b);
	
	int[][] c = new int[8][8];	
        int answer = 0;
		
	//정각 시계방향으로
	if(a-2>-1 && b+1<8) answer++; 
	if(a-1>-1 && b+2<8) answer++;
	if(a+1<8 && b+2<8) answer++;
	if(a+2<8 && b+1<8) answer++;
	if(a+2<8 && b-1>-1) answer++;
	if(a+1<8 && b-2>-1) answer++;
	if(a-1>-1 && b-2>-1) answer++;
	if(a-2>-1 && b-1>-1) answer++;
				
        return answer;
    }    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
