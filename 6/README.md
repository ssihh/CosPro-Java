6차 기출(구름 기준 6차기출 = 프로그래머스 기출문제)<br>

#### 인자값 사용
- 칸수 k 사용, 인자값 사용 상수아님

        for(int i=0; i<n;i++){
            
            if(kan + words[i].length() > K){ //상수10 사용하지 말고 인자K를 사용해야합니다.,.
                answer++;
                kan=0;
            }
            kan += words[i].length() +1;
            // System.out.print(words[i]+", "+kan+" |");
        }

<br>

#### BFS 좌표기반 탐색
- while(!q.isEmpty()) : 느낌표! 큐가 비지 않을때까지
- boolean[][] visited : 방문배열은 부울형

        while(!q.isEmpty()){ //! 느낌표. 큐가 비지 않을때까지
            int[] crt = q.poll();
            int cx = crt[0];
            int cy = crt[1];
                                   
            for(int i=0; i<4; i++){
                int nx = cx+dx[i]; //다음 x,y값
                int ny = cy+dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<n){ //좌표 유효성 검사
                    if(garden[nx][ny]==0 && !visited[nx][ny]){
                        q.offer(new int[] {nx, ny});
                        visited[nx][ny]=true;
                        garden[nx][ny]=garden[cx][cy] +1;

                    }
                }
            }
        }

<br>

#### 종이접기 : 2차원 배열
Q5. 종이접기 (디버깅) - 출처: https://honeywater97.tistory.com/268 <br>
어느정도 직감으로 푸신분 : k는 항상 j와의 관계를 나타내므로( k는 j+1이기 때문) j와 k의 관계가 고정이다. <br>

        i, j  |  j, i
        i, k  |  k, i
        정답에서는 기준좌표를 뒤집었습니다. 하하
        
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                for(int k = j + 1; k < 4; k += 2)
                    answer = Math.max(answer, Math.max(grid[i][j] + grid[i][k], grid[j][i] + grid[k][i]));
        return answer;

<br>

#### extends
- extends Job { 소문자e로 시작 | 뒤에 s | 소괄호 없이 바로 { 붙음
<br>


    class Solution {
      class Job {
          public int salary;
  
          public Job() {
              this.salary = 0;
          }
  
          public int getSalary() {
              return salary;
          }
    }

    class PartTimeJob extends Job { 
        public int workHour, payPerHour;

        public PartTimeJob(int workHour, int payPerHour) {
            this.workHour = workHour;
            this.payPerHour = payPerHour;
        }

        public int getSalary() {
            salary = workHour * payPerHour;
            if(workHour >= 40)
                salary += (payPerHour * 8);

            return salary;
        }
    }
