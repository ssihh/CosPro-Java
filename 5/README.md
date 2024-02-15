5회차 기출
<br>

#### 3.6 p진법 to q진법 : 진법의 이해 
- 3진법(10진법) : 11(4) | 8진법(10진법) : 144(100)

      
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
