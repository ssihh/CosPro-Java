// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 64;
			boolean[][] visited = new boolean[8][8];
			int n = bishops.length;
			int[][] pos = new int[n][2];
			
			for(int i=0; i<n; i++){
				String s = bishops[i];
				int x = s.charAt(0) - 'A';
				int y = s.charAt(1) - '1';
				pos[i] = new int[] {x,y};

			}
		
			int[] dx = {1,1,-1,-1};
			int[] dy = {1,-1,-1,1};
			
			for(int i=0; i<n; i++){ //비숍 개수 만큼
				int cx = pos[i][0];
				int cy = pos[i][1];
				if(!visited[cx][cy]){
					visited[cx][cy]=true;
					answer--;
				}
				
				for(int j=0; j<4; j++){ //4방향
					int nx = cx;
					int ny = cy;
					
					for(int c=0; c<8; c++){
						nx += dx[j];
						ny += dy[j];	
						
						
						if(nx>=0 && ny >=0 && nx<8 && ny<8){
							if(!visited[nx][ny]){
								visited[nx][ny]=true;
								answer--;
							}
						}
				
					}


				
				}}
			
			
			
        return answer;
    }

