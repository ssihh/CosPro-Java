// 다음과 같이 import를 사용할 수 있습니다. n진법 이해
import java.util.*;

class Main {	
    public String solution(String s1, String s2, int p, int q) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
			int n1 = s1.length()-1;
			int n2 = s2.length()-1;
			
			int num =0;
			int pw = 0; //제곱 수. 0제곱부터 시작
			
			for(int i=n1; i>=0; i--){
				num += Integer.parseInt(s1.substring(i, i+1)) * Math.pow(p,pw); 
				pw++;
			}
			//   1  1  2 0 0 1 (3진법)
			// 243 81 27 9 3 1 
			// System.out.println(num);
			
			pw=0; //제곱수 초기화
			for(int i=n2; i>=0; i--){
				num += Integer.parseInt(s2.substring(i, i+1)) * Math.pow(p,pw);
				pw++;
			}
			// System.out.println(num);
			
			while(num>0){
				answer = Integer.toString(num%q) + answer; // 앞에 숫자 붙이기 + answer을 뒤로
				num /= q; //계산기 두드려보니까 이게 됨
			}

        return answer;
    }
    
