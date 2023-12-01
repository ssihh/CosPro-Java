// 풀이: https://drcode-devblog.tistory.com/123
import java.util.*;

class Main {
    
		public int solution(int a, int b) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
				
				List<Boolean> list = new ArrayList<>();
				list.add(false); list.add(false); // 0,1은 false
				
				for(int i=2; i<=b; i++){
					list.add(true); //2이후 ture
				}
			//그림의 경우, {11^{2}>120}이므로 11보다 작은 수의 배수들만 지워도 충분하다. 
			// 즉, 11보다 작거나 같은 소수 가운데 2, 3, 5, 7의 배수를 지우고 남는 수는 모두 소수이다
				for(int j=2; j*j<=b; j++){	//{b제곱근보다 작은거나 같은 소수의 배수}를 지우고, 남는 수는 모두 소수
					if(list.get(j)){
						for(int k=j*j; k<=b; k+=j){
							list.set(k, false);
						}
					}
				}// 소수끝
				
				List<Integer> prime = new ArrayList<>(); //<>타입 생략가능
				for(int i = 0; i<list.size(); i++){
					if(list.get(i)){
						prime.add(i);
					}
				}// 소수만 따로 추가하는 Int 리스트
			
			// System.out.print(prime);
				
			for(int i=0; i<prime.size(); i++ ){
				int n2= (int)Math.pow(prime.get(i), 2); //Math.pow() 반환값 타입은 double 입니다.
				int n3= (int)Math.pow(prime.get(i), 3);
				if (n2>=a && n2<=b) answer++;
				if (n3>=a && n3<=b) answer++;
			}

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args){
        Main sol = new Main();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
