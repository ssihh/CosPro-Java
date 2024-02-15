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


<br>

#### 3.10 밥먹고 머리자르고 : && || , Iterator (이터레이터, iterat : 순환하다, 반복하다)
- 논리연산자 &&, || 주의: 2미만이면서 8초과인 수는 없으므로 || 으로



	    class Shop{
	        protected ArrayList<Customer> reserveList;
	        public Shop() {
				this.reserveList = new ArrayList<Customer>();
			}
	        public boolean reserve(Customer customer){
	            reserveList.add(customer);
	            return true;
	        }
	    }
	    class Customer{
	        public int id;
	        public int time;
	        public int numOfPeople;
	        public Customer(int id, int time, int numOfPeople){
	            this.id = id;
	            this.time = time;
	            this.numOfPeople = numOfPeople;
	        }
	    }
	    class Restaurant extends Shop {
	        public Restaurant(){
	            super();
	        }
        
        public boolean reserve(Customer customer){
            if(customer.numOfPeople<2 || customer.numOfPeople>8) //논리연산자 주의
                return false;
            int count = 0;


- Iterator<Customer> iter = reserveList.iterator();
1) iter.hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환한다.
2) iter.next(): 다음 요소를 가져온다.

            Iterator<Customer> iter = reserveList.iterator(); //iterator()
            while (iter.hasNext()) {
                Customer r = iter.next(); 
                if(r.time==customer.time)
                    count += 1;
            }

