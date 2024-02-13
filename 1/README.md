1차 기출(구름)


#### 1.2 해밍거리 
- str.charAt(i) 문자 같은지 비교할 때

        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i)!=binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;

<br>

#### 1.4 타임머신 : 형변환
Long ↔ String 형변환과 str 문자열 추가 += " ", char

- s.repalce("0","1")

        long answer = num+=1;
				String s = Long.toString(num); //long->String형변환
			  //System.out.print(s.replace("0", "1"));
				answer=Long.parseLong(s.replace("0", "1")); // 0인거 1로 변환 replace
        return answer;

내풀이

        String snum = Long.toString(num);
        String new_snum = "";	
			
        for(int i=0; i<snum.length(); i++){
                if(snum.charAt(i)=='0'){
                        new_snum += "1";
                }
                else{
                        new_snum += snum.charAt(i);
                }
        }
        answer = Long.parseLong(new_snum);
        

<br>

#### 1.5 소용돌이 수
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

<br>

#### 1.6 체스의 나이트 : 형변환 str, char, int
- str.char형 해서 - '작은따옴표' : int에 할당하면 int 됨.

		int cx =pos.charAt(0)-'A'; // cx: current x좌표 현재좌표
		int cy =pos.charAt(1)-'1';



