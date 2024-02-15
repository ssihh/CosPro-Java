// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
	public int solution(int number, int target) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		int[] vc = new int[10001]; //visited & count | 범위는 10001까지? 5100 일때도 *2해야하는뎅 흠 ㅎ
		//[target+1]까지로만 하니까 얘가 *2 값이 target을 넘게 못하는 구간이 생김.
		
		q.offer(number); //큐에 넣어주고
		vc[number] = 1; //방문했다 카운트 1
		
		while(!q.isEmpty()){
			int n = q.poll();
			// System.out.println(n);
			if(vc[target] != 0) break; // target 방문했으면 종료
			
			if(n-1>=0 && vc[n-1]==0) {
				q.offer(n-1);
				vc[n-1]=vc[n]+1;
			}
			
			if(n+1<=target && vc[n+1]==0) {
				q.offer(n+1);
				vc[n+1]=vc[n]+1;
			}
			
			if(n*2<=10001 && vc[n*2]==0) {
				q.offer(n*2);
				vc[n*2]=vc[n]+1;
			}
			
		}
		
		answer = vc[target]-1; //1부터 시작했으니까
		
		return answer;
	}

