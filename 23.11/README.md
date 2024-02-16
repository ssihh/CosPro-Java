23.11복기문제

#### 2_빈칸. 두개 뽑아서 더하기(해시) : HashSet, Iterator
문제(프로그래머스): https://school.programmers.co.kr/learn/courses/30/lessons/68644 <br>

1) Set : 중복허용X, 순서보장X | add, contains, delete <br>
2) HashMap : key : value 저장 | key는 중복이 되지 않음.
3) HashSet : HashMap의 key값을 활용.

        HashSet<Integer> hs = new HashSet<>(); //new HashSet<>();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                hs.add(numbers[i]+numbers[j]); //hs.add()
            }       }
        Iterator<Integer> iter = hs.iterator(); //hs.itertor(); <Integer> 해줘야 answer 넣어줄때 (int) 안붙여도 오류안남.
        answer = new int[hs.size()]; //hs.size(); answer 크기 초기화 해줘야 오류 안남
        
        int c=0;
        while(iter.hasNext()){ //iter.hasNext()
            answer[c++]=iter.next();  //iter.next()
        }
        
<br>


#### 7_디버깅. 큰 수 만들기(그리디=탐욕) : 아이디어
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


#### 8_구현. 호텔대실 : 시간
문제(프로그래머스): https://school.programmers.co.kr/learn/courses/30/lessons/155651#
- 시간을 분으로 바꿔주고, 분마다 room++;
- 배열값중 큰값 출력은 sort후 마지막 값 출력

        Arrays.sort(room); //Arrays.sort(arr)쓰려면 class 보다 상위에 import 필요
        answer=room[room.length -1];


#### 9_구현. 모음사전 : 재귀함수
문제(프로그래머스): https://school.programmers.co.kr/learn/courses/30/lessons/84512 
- import java.util.*; : 이유모를 에러뜨면 임포트
- ArrayList.get(i) : 어레이리스트는 get(i)로 값 가져옴. 겟아이
- str.equals(str) : 문자열 비교는 이퀄스

        import java.util.*; // 이유모를 에러뜨면 import 해보자

            ArrayList<String> sazon = new ArrayList<>(); //List 인터페이스를 구현한 클래스이기 때문에 저장된 값의 순서를 유지하고 중복을 허용한다. 

                if(len<5){
                DFS(len+1, str.concat(alpha[i]));

            if(word.equals(sazon.get(i))){ //i번째 값에 넣어주고
                answer = i;
                break;
            
