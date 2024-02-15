// 풀이: https://drcode-devblog.tistory.com/125
import java.util.*;

class Main {	
    public String solution(String s1, String s2, int p, int q) {
        // 여기에 코드를 작성해주세요.
      String answer = "";
      
      int n1=0, n2=0, asc=0;
      for(int i=s1.length()-1; i>-1; i--){
        n1 += (s1.charAt(i)-'0') * Math.pow(p,asc);
        asc++;
      }
      
      asc=0;
    
      for(int i=s2.length()-1; i>-1; i--){
        n2 += (s2.charAt(i)-'0') * Math.pow(p,asc);
        asc++;
      }
    
			int sum= n1+n2;
			
			while(sum>0){			//q진법
				answer = Integer.toString(sum%q) + answer;
				sum /= q;
			}

      return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
    public static void main(String[] args) {
    	Main sol = new Main();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
   }
}
