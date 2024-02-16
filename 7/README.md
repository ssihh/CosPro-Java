기출추천 백준

#### 1. 토마토 : BFS
문제(백준): https://www.acmicpc.net/problem/7576 <br>
1) while문 조건 논리연산자 : && 일때 둘다 참이어야 실행한다는 뜻 하나라도 참이 아니면 실행 안함

		while(!q.isEmpty() && t0 !=0 ) {
		//논리연산자 하나라도 해당되면 그만!, || 일때 null을 계속 뱉더라

2) count 전역변수 : 마지막으로 들어간 값이 최종값일테니이
        
        public static int day;
        day = map[nx][ny]; //출력값

3) 출발지가 여러 곳 일때 : Q전역변수 하고 값 넣을 때 바로 offer

		else if(t == 1) { //출발지가 여러갠데 어카지
			q.offer(new int[] {i,j}); // 이렇게 바로 

<br>

#### 2. 연산자 끼워넣기
문제(백준): https://www.acmicpc.net/problem/14888 <br>
1) switch (i) { case 0 : break; : 볼 때마다 새로운 스위치 (소괄호) {중괄호 case 0 :땡떙 break;
2) 나오면서 ++ 다시 원복해줌.

		for (int i = 0; i < 4; i++) { // 연산자 4종류만큼 +, -, *, /

			if (oper[i] > 0) { // 연산자 개수가 남아있을 때
				
				oper[i]--; //연산자 사용 
				switch (i) {
				case 0:
					DFS(idx + 1, num + number[idx]);
					break;
				case 1:
					DFS(idx + 1, num - number[idx]);
					break;
				case 2:
					DFS(idx + 1, num * number[idx]);
					break;
				case 3:
					DFS(idx + 1, num / number[idx]);
					break;
				// idx+1 값이 가니까 다음 숫자를 활용한 계산 가능
				}
				oper[i]++;// 빼준곳에서 다시 ++원복
			}		}		}

3) 전역변수 n 사용. 앞에 int붙이지 않기

		n = Integer.parseInt(st.nextToken());
		//전역변수 n을 써야디

4) 연산자 4개니까 상수 사용 4까지

		oper = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) { // 4개자나!!!
			int o = Integer.parseInt(st.nextToken());
			oper[i] = o;
		}
