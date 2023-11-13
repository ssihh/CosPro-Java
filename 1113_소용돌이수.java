// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public int solution(int n) {
						int[][] arr = new int[n][n];
			System.out.println(Arrays.toString(arr[0])); //배열선언하면 0이 디폴트값
			int i = 0, j = 0;
			int dir = 0; // dir : 0 → , dir : 1 ↓, dir : 2 ←, dir : 3 ↑
			int num = 1;

			while(true) {
				arr[i][j] = num; //arr[0][0]==1

				//방향을 바꾸는 조건
				if(dir == 0 && (j == n-1 || (j < n-1 && arr[i][j+1] != 0 )))
					dir++; //0 → && 맨 우측상단 이거나|| 우측값이 0이 아닌경우
				else if(dir == 1 && (i == n-1 || (i < n-1 && arr[i+1][j] != 0))) 
					dir++; //1 ↓ && 맨 우측하단이거나
				else if(dir == 2 && (j == 0 || (j > 0 && arr[i][j-1] != 0))) 
					dir++; //2 ← && 맨 좌측하단
				else if(dir == 3 && ((i > 0 && arr[i-1][j] != 0))) 
					dir = 0; //3 ↑ && 

				// 나아가는 방향
				if(dir == 0) j++;
				else if(dir == 1) i++;
				else if(dir == 2) j--;
				else if(dir == 3) i--;

				if(num == n*n) break;
				num++;
			}

			int answer = 0;
			i = 0;

			while(i <= n-1) {
				answer += arr[i][i]; i++;
			}

			return answer;

    }
  // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
