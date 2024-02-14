// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 64;
	boolean[][] visited = new boolean[8][8];
	int n = bishops.length; //비숍 개수
	int[][] pos = new int[n][2]; //비숍들 좌표

	//비숍들 좌표 넣어 
	for(int i=0; i<n; i++){ 
		String s = bishops[i];
		int x = s.charAt(0) - 'A';
		int y = s.charAt(1) - '1';
		pos[i] = new int[] {x,y};
		visited[x][y]=true;
		answer--;
		
	}

	//방향 선언
	int[] dx = {1,1,-1,-1};
	int[] dy = {1,-1,-1,1};

	    
	for(int i=0; i<n; i++){ //비숍 개수 만큼
		int cx = pos[i][0];
		int cy = pos[i][1];
		
		for(int j=0; j<4; j++){ //4방향
			int nx = cx;
			int ny = cy; 
			
			while(true){ //길 막히면 break로 탈출
				nx += dx[j];
				ny += dy[j];	
				
				if(nx>=0 && ny >=0 && nx<8 && ny<8){
					if(!visited[nx][ny]){
						visited[nx][ny]=true;
						answer--;
					}
				}
				else{
					break; //길 막히면 while문 탈출
				}
			}

		}
	}
	
	/* 
	for(int i=0; i<8; i++){
		for(int j=0; j<8; j++){
			if(visited[i][j]){
				System.out.print(0+", ");
			}
			else{
				System.out.print(1+", ");
			}
		}	
		System.out.println();
	}
	*/

			
        return answer;
    }

