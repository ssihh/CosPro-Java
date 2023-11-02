// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int l = arr.length;
        int answer = 0;
        //System.out.println(l);
        for(int i=0;i<=(l-K);i++){
            int t = arr[K+i-1]-arr[i];
        
            if (t==0){ //차이가 0일때 0반환하고 for문 탈출
                answer=0;
                break;
            }
            
            if (i==0){ //첫번째 차이값이 디폴트answer값
                answer=t;
            }
            
            if(t<answer){ //차이값이 그전차이값보다 작으면 t값 업데이트
                answer=t;
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        // int[] arr = {9, 11, 9, 6, 4, 19};
        int[] arr = {9, 11, 9, 6, 4, 12}; //4 6 9 9 11 12
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}
