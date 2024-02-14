// 다음과 같이 import를 사용할 수 있습니다. 정리 덜됨 ㅎ
import java.util.*;

class Main {
  
	public int[] prime;
	
	public int[] isPrime(int a, int b){
		boolean[] pri = new boolean[b/2] ;
		
		for(int i=2; i<b/2 ; i++){
			pri[i]=true;
		}
			
		for(int i=2; i<b/2 ;i++){
			for(int j=i+i; j<b/2; j+=i){
				pri[j]=false;
			}
		}
		
		prime = new int[b/2]; 
		int p=0;
		for(int i=2; i<b/2; i++){
			if(pri[i]){
				prime[p++]=i;
			}
		}
			
		return prime;
	}
	
	public boolean isPrime2(int p){
		for(int i=0; i<prime.length; i++){
			if (prime[i]==p){
				return true;
			}
		}
		return false;
	}
	
	public int solution(int a, int b) {
        // 여기에 코드를 작성해주세요.
		prime = isPrime(a,b);
		int answer =0;
		// System.out.println(Math.sqrt(a));		
		for(int i=2; i<=Math.sqrt(b); i++){
			if(isPrime2(i)){
				if(i*i>a && i*i <= b){
					answer++;
					// System.out.println(i*i);
				}
				if(i*i*i> a && i*i*i <=b){
					answer++;
				}
			}
		}
		
    
		
        return answer;
    }

