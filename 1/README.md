1차 기출(구름)

#### 해밍거리 
- str.charAt(i) 문자 같은지 비교할 때

        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i)!=binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;

#### 소용돌이 수
풀이 이해 dx, dy 없이 방향 for() if()문 조건으로 함<br>
2차원 배열로 봤을 때 y는 왼쪽, 오른쪽 x는 아래, 위쪽<br>

        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int x=0; int y =0; int d=0;
        
        for(int i=1; i <= n*n; i++){
                //값 저장
                map[x][y] = i;
                
                //방향 바꾸는 조건 if
                if(d==0 && (y==n-1 || map[x][y+1]!=0)) d++;
                else if(d==1 && (x==n-1 || map[x+1][y]!=0)) d++;
                else if(d==2 && (y==0 || map[x][y-1]!=0)) d++;
                else if(d==3 && (map[x-1][y]!=0 )) d=0;
                
                //지금 d에 해당되는 방향으로 가!
                if(d==0) y++;
                else if(d==1) x++;
                else if(d==2) y--;
                else if(d==3) x--;
                
        }
