2차 기출
<br>

#### length : (X) 배열[] | length() : (O) 문자열 길이 String 
1. length<br>
 - arrays(int[], double[], String[])<br>
 - length는 배열의 길이를 알고자 할때 사용된다.<br>
 
2. length()<br>
 - String related Object(String, StringBuilder etc)<br>
 - length()는 문자열의 길이를 알고자 할때 사용된다.<br>
출처: https://mine-it-record.tistory.com/126 [나만의 기록들:티스토리]

#### 2.4 합이 K배가 되는 수 : 조합인줄 알았는데 3중 for문으로 가능

	for(int i=0;i<arr.length;i++)
		for(int j=i+1; j<arr.length ; j++)
			for(int k=j+1 ; k<arr.length; k++){
				if((arr[i]+arr[j]+arr[k]) % 3 == 0) answer++;
			}

<br>

#### 2.6 로봇을 움직여 주세요 : Switch Case 문법 생각안나면 더 친숙한 if-else if문으로

	int x=0; int y=0;
	for(int i=0; i<n; i++ ){
		// System.out.print(commands.charAt(i));
		char d = commands.charAt(i);
		if(d=='L') x--;
		else if(d=='R') x++;
		else if(d=='U') y++;
		else if(d=='D') y--;
	}
