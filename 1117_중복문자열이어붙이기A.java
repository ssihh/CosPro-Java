// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String s1, String s2) {
        // 여기에 코드를 작성해주세요.
                int answer = 0;
        //s1의 끝과 s2의 시작을 비교한다. for 문으로 달라질때까지 비교한다.
        int shortLength=0;  //s1과 s2중 짧은 문자열의 길이
        int overlapLength=0; //s1과 s2의 중복 문자열의 길이
        int tmpOverlapLength; //더 짧은 중복 문자열의 길이
        shortLength=Math.min(s1.length(),s2.length()); //for문을 몇번 수행할지 결정한다.

        for(int i=0;i<shortLength;i++){
            //s1의 앞부분과 s2의 뒷부분 문자열을 비교한다.
            if(s1.substring(s1.length()-1-i).equals(s2.substring(0,i+1))){
                //이미저장된 overlapLength와 방금 계산한 overlapLength중 긴것을 저장한다.
                overlapLength=Math.max(overlapLength,i+1);
            }
        }
				System.out.println(overlapLength);
        tmpOverlapLength=overlapLength; //임시저장
        overlapLength=0; //s2와 s1의 순서를 바꾸어서 다시 수행한다.
        for(int i=0;i<shortLength;i++){
            if(s2.substring(s2.length()-1-i).equals(s1.substring(0,i+1))){
                overlapLength=Math.max(overlapLength,i+1);
            }
        }
				System.out.println(overlapLength);
        //더 긴 overlapLength를 찾아서 합쳐진 문자열의 길이를 구한다.
        answer=s1.length()-Math.max(tmpOverlapLength,overlapLength)+s2.length();

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
