# CosPro-Java
코스프로 자바 1급 <br>
https://school.programmers.co.kr/learn/courses/11132/11132-cos-pro-1급-java-모의고사<br>
<br>

### 형변환
Long.toString(long): Long -> String형변환<br>
Long.parseLong(str): String -> Long<br>
str.charAt(i): String -> char<br>
int n = str.charAt(0): 아스키 -> 10진수 <br>
int a= 8-(pos.charAt(1)-'0'); //7 .1 | int b= pos.charAt(0)-'A'; //A .0 : char형을 int선언한거에 대입

#### 10진수
48: 0    |  49: 1 <br>
65: A    |  97: a

### 배열
int[][] arr = new int[n][n];: 2차원 배열 선언. 양옆에 int[][], 모든 원소 값이 0으로 초기화되어있다.<br>
arr.length: 배열 길이 <br>
arr[i].length(): arr[i]에 있는 문자 길이. 마지막에 ()가 들어간다<br>
Arrays.toString(arr): 배열을 String으로 출력. 안그럼 이상한 문자가 출력된다. <br> 
  2차원배열출력: Arrays.toString(arr[0]) 한행씩 가능 <br>
Arrays.sort(arr): 배열정렬<br>

## 메소드
str.replace("0","1"): str중 "0"을 문자를 "1"로 변환<br> 
Math.min(arr): 최소값. // Math.min(answer, arr[i]): 이렇게활용가능 <br>

#### 좌표
좌표이동: dx[], dy[], cx, cy, nx, ny  |   nx>-1 && nx<8 && ny>-1 && ny<8 <br>
달팽이 직진 커브: dir=0; dir++;

