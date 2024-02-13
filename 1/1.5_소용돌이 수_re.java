import java.io.*;
import java.util.*;

class Main {
    public int solution(int n) {
        
        int answer = 0;
				
			int[][] map = new int[n][n];
			boolean[][] visited = new boolean[n][n];

			int x=0; int y =0; int d=0;
			
			for(int i=1; i <= n*n; i++){
				//값 저장
				map[x][y] = i;
				
				//방향 바꾸는 조건 if
				if(d==0 && (y==n-1 || map[x][y+1]!=0)) d++;
				else if(d==1 && (x==n-1 || map[x+1][y]!=0)) d++;
				else if(d==2 && (y==0 || map[x][y-1]!=0)) d++;
				else if(d==3 && (map[x-1][y]!=0 )) d=0;
				
				//지금 d에 해당되는 방향으로 가!
				if(d==0) y++;
				else if(d==1) x++;
				else if(d==2) y--;
				else if(d==3) x--;
				
			}
			
			
			for(int i=0; i<n; i++){
				answer+=map[i][i];
				System.out.println(Arrays.toString(map[i]));
			}
			
        return answer;
    }
    
 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 4;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 5;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
