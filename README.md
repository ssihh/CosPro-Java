# CosPro-Java
코스프로 자바 1급 <br>
https://school.programmers.co.kr/learn/courses/11132/11132-cos-pro-1급-java-모의고사<br>
<br>

#### Iterator
0) Iterator iter = hashSet.iterator();
1) hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환한다. <br>
2) next(): 다음 요소를 가져온다. <br>
answer[k++]=(int)iterator.next(); //형변환 필수
3) remove(): next()로 읽어온 요소를 삭제한다. <br>
4) hasPrevious(), previous()<br>

#### HashSet
1) HashSet<Integer> hashSet = new HashSet<>(); 선언<br>
Iterator iterator = hashset.iterator(); //hashset.에 쓰일 Iterator()선언 
2) hashSet.add(i);
3) hash.size();

#### StringBuilder
1) StringBuilder answer = new StringBuilder();
2) answer.append(int) //한글자씩 추가 가능

#### 형변환
Integer.toString(int): Int -> String혁변환<br>
Long.toString(long): Long -> String형변환<br>
Long.parseLong(str): String -> Long<br>
str.charAt(i): String -> char<br>
int n = str.charAt(0): 아스키 -> 10진수 <br>
int a= 8-(pos.charAt(1)-'0'); //7 .1 | int b= pos.charAt(0)-'A'; //A .0 : char형을 int선언한거에 대입

#### 10진수
48: 0&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;49: 1 <br>
65: A   &nbsp;&nbsp;&nbsp;&nbsp;| &nbsp; 97: a

#### 배열, 2차원배열, String
1) int[][] arr = new int[n][n];: 2차원 배열 선언. 양옆에 int[][], 모든 원소 값이 0으로 초기화되어있다.<br>
   String[][] str; //파라미터 값<br>
   str.length //배열 길이 ()안붙여도됨<br>
3) arr.length: 배열 길이 <br>
4) arr[i].length(): arr[i]에 있는 문자 길이. 마지막에 ()가 들어간다<br>
arr.substing(i,i+1): String 끊어읽기. charAt(i)대신 쓰기좋음<br>
Arrays.toString(arr): 배열을 String으로 출력. 안그럼 이상한 문자가 출력된다. <br> 
  2차원배열출력: Arrays.toString(arr[0]) 한행씩 가능 <br>
Arrays.sort(arr): 배열정렬<br>

### ArrayList
Arrlist.get(i): 값불러오기. 배열이랑 다름

## 메소드
str.equals(str): 문자열 같은지 비교할 때. == 말고 eqauls()사용<br>
str.replace("0","1"): str중 "0"을 문자를 "1"로 변환<br> 
Math.min(arr): 최소값. // Math.min(answer, arr[i]): 이렇게활용가능 <br>

#### 좌표
좌표이동: dx[], dy[], cx, cy, nx, ny  &#160;&#160;&#160;&#160;|&#160;&#160;&#160;&#160;   nx>-1 && nx<8 && ny>-1 && ny<8 <br>
달팽이 직진 커브: dir=0; dir++;


