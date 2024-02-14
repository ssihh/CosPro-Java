3회차 기출(구름) - 시간 안에 8/10 채점해보니 틀린거 있었 | 다 푸는 기준 1:45 소요 10/10 | 

#### 3.5 전광판 문구 출력 
- substring(1) 파라미터값 하나 일 때 그 숫자 기준으로 끝까지 출력.

			for(int i=0; i<14; i++) answer += "_";  //어플은 화면에 14자 문구를 출력합니다.
			answer += phrases; //______________happy-birthday 28문자
			
			for(int i=0; i<second; i++){ //초만큼
				char first = answer.charAt(0); //첫번째 값 떼어서
				answer += first; //뒤에 붙여주고 | 그럼 지금 길이 29문자
				answer = answer.substring(1); //0번째 패스, 1부터 끝까지 다시 answer에 넣어 | 다시 28문자
			}

        return answer.substring(0,14);
