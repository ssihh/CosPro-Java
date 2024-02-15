5회차 기출
<br>

#### 3.6 p진법 to q진법 : 진법의 이해 
- 3진법(10진법) : 11 (3,1 : 4) | 8진법(10진법) : 144 (64,8,1 : 100)

      
	        int pw = 0; //제곱 수. 0제곱부터 시작
				
		for(int i=n1; i>=0; i--){
			num += Integer.parseInt(s1.substring(i, i+1)) * Math.pow(p,pw); 
			pw++;
		}
		//   1  1  2 0 0 1 (3진법)
		// 243 81 27 9 3 1 
		
		pw=0; //제곱수 초기화
		for(int i=n2; i>=0; i--){
			num += Integer.parseInt(s2.substring(i, i+1)) * Math.pow(p,pw);
			pw++;
		}
		
		while(num>0){
			answer = Integer.toString(num%q) + answer; // 앞에 숫자 붙이기 + answer을 뒤로
			num /= q; //계산기 두드려보니까 이게 됨 
		}

<br>

#### 5.7 그래프에서 싸이클찾기 : 유니온(union) & 파인드(find)

#### 5.9 몇번 연산을 해야하나요 : 큐(Queue) 


		int[] vc = new int[10001]; //visited & count | 범위는 10001까지? 5100 일때도 *2해야하는뎅 흠 ㅎ
		//[target+1]까지로만 하니까 얘가 *2 값이 target을 넘게 못하는 구간이 생김.
		
		q.offer(number); //큐에 넣어주고
		vc[number] = 1; //visited, count 둘 역할을 함. 방문했고 카운트는 1이다
		
		while(!q.isEmpty()){
			int n = q.poll();
			// System.out.println(n);
			if(vc[target] != 0) break; // target 방문했으면 종료 (중략)...
			
			if(n*2<=10001 && vc[n*2]==0) { //target<=로만 했을 때는 *2 값이 target을 넘게 못하는 구간있어 10001로수정
				q.offer(n*2);
				vc[n*2]=vc[n]+1;
			}
		}
		answer = vc[target]-1; //1부터 시작했으니까
