//ㅎㅎ 혼자풀었다!

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
		
		public int count(int[][] arr){
			int c=0;
			for(int a=0;a<8;a++)
				for(int b=0;b<8;b++)
					if(arr[a][b]==0)
						c++;
			return c;
		}
	
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
				int[][] arr = new int[8][8];
				
				int[][] bset = new int[bishops.length][2];
				
				for(int i=0;i<bishops.length;i++){
					bset[i][0]=bishops[i].charAt(0)-'A';
					bset[i][1]=bishops[i].charAt(1)-'1';
				}
				
				int[] dx = {-1,-1,1,1};
				int[] dy = {-1,1,1,-1};
				int cx=0, cy=0;
			
				for(int j=0; j<bset.length; j++){
					int d=0;
					cx = bset[j][0];
					cy = bset[j][1];
					arr[cx][cy]=1;
					while(d<4){
						if(cx+dx[d]<8 && cx+dx[d]>-1 && cy+dy[d]<8 && cy+dy[d]>-1){
							cx+=dx[d];
							cy+=dy[d];
							arr[cx][cy]=1;
						}
						else{
							d++;
							cx = bset[j][0];
							cy = bset[j][1];
						}
					}
				}
				
				// for(int k=0; k<8;k++)
					// System.out.println(Arrays.toString(arr[k]));
			
				answer=count(arr);
			
        return answer;
    }

