2차 기출
<br>

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
