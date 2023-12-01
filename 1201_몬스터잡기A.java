// 풀이: https://drcode-devblog.tistory.com/124
import java.util.*;

class Main {
    public int solution(int[] enemies, int[] armies) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
			
				for(int i=0; i<armies.length; i++){
					int n=0;
					for(int j=0; j<enemies.length; j++){
						if(enemies[j]<=armies[i]) n++;
					}
					answer=Math.max(answer,n);
				}
			// 	List<Boolean> list = new ArrayList<>();
			// 	for(int i=0; i<enemies.length;i++) list.add(false);
			
			// 	for(int i=0; i<enemies.length ; i++){
			// 		for(int j=0; j<armies.length ; j++){
			// 			if(enemies[i]<=armies[j]){
			// 				list.set(i, true);
			// 			}
			// 		}
			// 	}
			  
			// 	for(int i=0; i<list.size(); i++){
			// 		if(list.get(i)){
			// 			answer++;
			// 		}
			// 	}
				
        return answer;
    }

