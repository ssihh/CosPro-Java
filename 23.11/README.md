23.11복기문제

#### 2_빈칸. 두개 뽑아서 더하기(해시) : HashSet, Iterator

        
<br>


#### 7_디버깅. 큰 수 만들기(그리디) : 아이디어
문제(프로그래머스): https://school.programmers.co.kr/learn/courses/30/lessons/42883 <br>
- for(초기값, 범위, 증가) 의 이해
- 노트에 그려서 정리 
  
        int idx=0; //max값 인덱스 초기값
        
        for(int i=0; i<number.length()-k; i++){ // i 6번실행 :max 6번 채워줘야함
            int max=0;
            for(int j=idx; j<=i+k; j++){ //1) for문 초기시작값이 idx이고 ; 3) j는 줏대있게 1씩증가
                //2) i최대 5 + k 4 = 9 까지는 탐색해야하니 j<=i+k(9)
                //2) i가 1씩 증가하니 j 탐색 범위 끝도 1(i)씩증가, 3) 시작값만 index
                
                int n = Integer.parseInt(number.substring(j,j+1)); 
                //실제로 탐색하는 범위는 j. i는 들어가지 않아 i는 단지 큰수만들 횟수 6번 진행한다는 뜻
                if(max < n){
                    max = n;
                    idx=j+1; //다음 인덱스
                }
            }
            answer += Integer.toString(max); 
            //탐색완료한 max값 넣어줌 10개숫자중 4개제거위해 6번실행

프로그래머스 시간초과
1) StringBuilder, append, toString() 으로 수정
2) charAt-'0'으로 수정. Integer.parseInt(str.substring(i,i+1)) 가 느린가봄

          StringBuilder answer = new StringBuilder();
          answer.append(max); 
          return answer.toString();

          int n = number.charAt(j)-'0'; 



<br>


####
