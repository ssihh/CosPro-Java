// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
	int max=0, tmp=0;
	int minlen = Math.min(s1.length(), s2.length());
	// System.out.println(s1.substring(-2,0));

	for(int i=0; i<minlen; i++){
		// System.out.println(s1.substring(s1.length()-1-i)+' '+s2.substring(0,1+i));
		if(s1.substring(s1.length()-1-i).equals(s2.substring(0,1+i))){
			max=Math.max(max,i+1);
			// System.out.println(i+1);
		}
	}
	tmp=max;

	for(int i=0; i<minlen; i++){
		if(s2.substring(s2.length()-1-i).equals(s1.substring(0,1+i))){
			max=Math.max(max,i+1);
			// System.out.println(i+1);
		}
	}
	
	answer=s1.length()+s2.length() - Math.max(max,tmp);

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
    
