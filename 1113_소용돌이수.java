// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;
class Main {
    public int solution(int n) {
        
        int answer = 0;
	int[][] arr = new int[n][n]; //2차원 배열 선언
 	System.out.println(Arrays.toString(arr[0]));
	int dir=0;
	int a=0; int b=0;
	
	for(int i=1; i<=n*n; i++){
		arr[a][b]=i; //값 저장
		
		//방향변경조건, !=0: 값이 있어서 막혀있을때 방향바꿈
		if(dir==0 && (b==n-1 || (b<n-1 && arr[a][b+1]!=0) )) dir++;
		else if(dir==1 && (a==n-1 || (a<n-1 && arr[a+1][b]!=0) )) dir++;
		else if(dir==2 && (b==0 || (b>0 && arr[a][b-1]!=0) )) dir++;
		else if(dir==3 && (a>0 && arr[a-1][b]!=0) )dir=0;
			
		//나아가는 방향
		if(dir==0) b++; //->
		else if(dir==1) a++; //아래
		else if(dir==2) b--; //<-
		else if(dir==3) a--; //위
	}
	
	for(int j=0;j<n;j++){
		answer+=arr[j][j];
		System.out.println(Arrays.toString(arr[j]));
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
