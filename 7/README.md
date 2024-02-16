기출추천 백준

#### 1. 토마토 : BFS
1) while문 조건 논리연산자 : && 일때 둘다 참이어야 실행한다는 뜻 하나라도 참이 아니면 실행 안함

		while(!q.isEmpty() && t0 !=0 ) {
		//논리연산자 하나라도 해당되면 그만!, || 일때 null을 계속 뱉더라

3) count 전역변수 : 마지막으로 들어간 값이 최종값일테니이
        
        public static int day;
        day = map[nx][ny]; //출력값

4) 출발지가 여러 곳 일때 : Q전역변수 하고 값 넣을 때 바로 offer

		else if(t == 1) { //출발지가 여러갠데 어카지
			q.offer(new int[] {i,j}); // 이렇게 바로 
