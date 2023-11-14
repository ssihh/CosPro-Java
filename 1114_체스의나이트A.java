// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public int solution(String pos) {
				int dx[] ={1,1,2,2,-1,-1,-2,-2}; // dx: direction x좌표 방향좌표
				int dy[] ={-2,2,-1,1,-2,2,-1,1};
				int cx =pos.charAt(0)-'A'; // cx: current x좌표 현재좌표
				int cy =pos.charAt(1)-'1';
				int answer=0;
				for(int i=0; i<8;i++){
						int nx=cx+dx[i]; //nx: next x좌표 다음좌표
						int ny=cy+dy[i];
						if(nx>-1 && nx<8 && ny>-1 && ny<8){
							answer++;
						}
				}
				return answer;
    }
      // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
