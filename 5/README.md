5회차 기출
<br>

#### 5.6 p진법 to q진법 : 진법의 이해 
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

#### 5.7 그래프에서 싸이클찾기 : 유니온(union) & 파인드(find) 279p
- 집합 표현하기(Gold 4) 282p
1) 대표노드 초기화
2) find 재귀함수 | return 조건 : 대표노드 자기자신 | 대표노드 찾는 함수  
3) union 합침 : parent[u]=v; 

		    public int find(int[] parent, int u) {
		        if(u == parent[u])
		            return u; //자기자신이 대표노드이면 return 재귀끝
		
		        parent[u] = find(parent, parent[u]); //대표노드를 찾는 find 재귀함수
		        return parent[u];
		    }
		
		    public boolean merge(int[] parent, int u, int v) {
		        u = find(parent, u); //각 노드의 대표노드 find
		        v = find(parent, v); 
		
		        if(u == v) //[2]: 3 == [3]: 3 대표노드가 같으면 true
		            return true;
		
		        parent[u]=v; //[1]: 2 , [2]: 3 대표노드끼리 연결하기 union=merge
		        return false;
		    }
		
		    public int solution(int n, int[][] connections) {
		        int answer = 0;
		
		        int[] parent = new int[n+1];
		        for(int i = 1; i <= n; i++)
		            parent[i]=i; //1) 대표노드 자기자신으로 초기화


<br>

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
