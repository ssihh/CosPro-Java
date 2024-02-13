// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int[] solution(String commands) {
        
        int[] answer = {};
			int n = commands.length();
			
			int x=0; int y=0;
			for(int i=0; i<n; i++ ){
				// System.out.print(commands.charAt(i));
				char d = commands.charAt(i);
				if(d=='L') x--;
				else if(d=='R') x++;
				else if(d=='U') y++;
				else if(d=='D') y--;
			}
			
			answer = new int[] {x,y};
			
        return answer;
    }

