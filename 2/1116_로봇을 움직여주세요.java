// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int[] solution(String commands) {
        

				int[] dx={-1,1,0,0};//L R U D
				int[] dy={0,0,1,-1};
			
        int cx=0; int cy=0;
				int nx=0; int ny=0;
				for(int i=0; i<commands.length() ;i++){
					if(commands.charAt(i)=='L'){
						nx=cx+dx[0];
						ny=cy+dy[0];
					}
					if(commands.charAt(i)=='R'){
						nx=cx+dx[1];
						ny=cy+dy[1];
					}
					if(commands.charAt(i)=='U'){
						nx=cx+dx[2];
						ny=cy+dy[2];
					}
					if(commands.charAt(i)=='D'){
						nx=cx+dx[3];
						ny=cy+dy[3];
						// System.out.println(ny);
					}
					cx=nx; cy=ny;
				}
        int[] answer = {nx,ny};
			
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
