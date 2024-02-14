// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        
			int n1 = s1.length();
			int n2 = s2.length();
			int s = Math.min(n1, n2);
			
			int answer = n1+n2;
			int max=0; //겹치는 max값을 구해서
			
			//s2 뒤에 s1 붙일 때
			for(int i=1; i<=s; i++){
				if(s1.substring(0,i).equals(s2.substring(n2-i,n2)) ){
					// System.out.print("되냐 ");
					max = Math.max(max, i);
				}
			}
			
			//s1 뒤에 s2 붙일 때
			for(int i=1; i<=s; i++){
				if(s2.substring(0,i).equals(s1.substring(n1-i,n1)) ){
					// System.out.print("되냐 ");
					max = Math.max(max, i);
				}
			}
			
			answer -= max; //answer에 맥스값 빼주기
        return answer;
    }
    
