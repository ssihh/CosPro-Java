class Main {
    public int solution(String pos) {
        
        int answer = 0;
			
			// 좌표 0,0 기준 변경
			int x = pos.charAt(0) - 65; //int x = char 하면 자동으로 int로 값 넣어짐
			int y = 8-Integer.parseInt(pos.substring(1,2));
			// System.out.println(x+", "+y);
			
			//방향 배열
			int[] dx = {1,2,2,1,-1,-2,-2,-1};
			int[] dy = {-2,-1,1,2,2,1,-1,-2};
			
			//맵.. 필요없을것 같기도
			// int[][] map = new int[8][8];
			
			for(int i=0; i<8; i++){ //8방향
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=0 && ny>=0 && nx<8 && ny<8){ //좌표 유효성 검사
					answer++;
				}
			}
			
			
			
        return answer;
    }
