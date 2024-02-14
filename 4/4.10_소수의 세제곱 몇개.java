// 다음과 같이 import를 사용할 수 있습니다. 전역변수 사용
import java.util.*;

class Main {
  
	//전역변수
	public static boolean[] pri;
	
	//pri 부울형에 a,b범위에 한해서 prime인지 true, false 값 넣어줌 
	public void isPrime(int a, int b){
		int n= (int)Math.sqrt(b); //범위: b 제곱근 n까지 | double형 -> int형으로 바꾸는건 (int) 달면됨
		pri = new boolean[n+1]; 
		
		for(int i=2; i<=n ; i++)	pri[i]=true;
			
		for(int i=2; i<=n ;i++){
			for(int j=i+i; j<=n; j+=i){
				pri[j]=false; //에라토스테네스의 채
			}
		}
		// System.out.println(pri[2]);	
	}

	public int solution(int a, int b) {
        // 여기에 코드를 작성해주세요.
		isPrime(a,b);
		int answer =0;
	
		for(int i=2; i<=Math.sqrt(b); i++){
			
			if(pri[i]){ //pri 부울형 
				if(i*i>=a && i*i <= b){
					answer++;
				}
				if(i*i*i>= a && i*i*i <=b){
					answer++;
				}
			}
		}

        return answer;
    }

