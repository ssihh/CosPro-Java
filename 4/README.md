4회차 기출<br>
문제가 아쉬운 회차. <br>
안풀리는게 있으면 넘어가고 쉬운 것부터 풀이! 남은 시간에 다시 보면 풀이가 보일지도 <br>

#### 4.1 사전에서 단어찾기 : 재귀함수 복기
문제(프로그래머스): https://school.programmers.co.kr/learn/courses/30/lessons/84512 <br>
<br>

#### 4.8 n번째 작은 수 구하기 : 가장 어려운 난이도

#### 4.9 분침과 시침의 각도 구하기 : 조건이 부실함

        answer = String.format("%.1f",gakdo); // 소수점 이하 첫째 자리까지 표현

<br>

#### 4.10 소수의 세제곱이 몇개 : 소수
- 에라토스테네스의 채
- Double->Int 형변환(int) : 제곱근 Math.sqrt(b) double형이라 앞에 (int) 붙여주면 형변환됨.
- N의 제곱근까지만 탐색하는 이유 : 소수 구하기. 218p
- 소수 판별 함수 : 신기한 소수 찾기. 156p

    	public void isPrime(int a, int b){
    		int n= (int)Math.sqrt(b); //범위: b 제곱근 n까지 | double형 -> int형으로 바꾸는건 (int) 달면됨
    		pri = new boolean[n+1]; 
    		
    		for(int i=2; i<=n ; i++)	pri[i]=true; 
    			
    		for(int i=2; i<=n ;i++){
    			for(int j=i+i; j<=n; j+=i){
    				pri[j]=false; //에라토스테네스의 채
    			}
    		}
    	}
