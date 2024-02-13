2차 기출
<br>

#### 2.4 합이 K배가 되는 수 : 조합인줄 알았는데 3중 for문으로 가능

	for(int i=0;i<arr.length;i++)
		for(int j=i+1; j<arr.length ; j++)
			for(int k=j+1 ; k<arr.length; k++){
				if((arr[i]+arr[j]+arr[k]) % 3 == 0) answer++;
			}
