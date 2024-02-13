// 다음과 같이 import를 사용할 수 있습니다. 발전했다
import java.util.*;

class Main {
    public int solution(int[] arr) {
        
        int answer = 0;
			int n = arr.length;
			int[] ormg = new int[n];
	
			
			for(int i=1; i<n ; i++){
				if(arr[i-1]<arr[i]){
					ormg[i]=ormg[i-1]+1;
				}
				else{
					ormg[i]=0;
				}
			}
			// System.out.println(Arrays.toString(ormg));
			Arrays.sort(ormg); //정렬해서 마지막에 있는값 +1 출력
			answer=ormg[n-1]+1;
				
        return answer;
    }

