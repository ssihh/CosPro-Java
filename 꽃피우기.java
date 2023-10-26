// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        boolean exit=true;
        
        //'다음날 가든' 정보. 즉, 다음날 필 꽃들의 정보를 저장
        int n = garden.length;
        int[][] nGarden = new int[n][n];
        
        while(true){
            exit=true;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(garden[i][j]==1){
                        
                        if(nGarden[i][j]==0) nGarden[i][j]=1;
                        if(i+1<n && nGarden[i+1][j]==0) nGarden[i+1][j]=1;
                        if(i-1>=0 && nGarden[i-1][j]==0) nGarden[i-1][j]=1;
                        if(j+1<n && nGarden[i][j+1]==0) nGarden[i][j+1]=1;
                        if(j-1>=0 && nGarden[i][j-1]==0) nGarden[i][j-1]=1;
                        
                    }
                    else
                        exit=false; //원소에 0이 있으면 while문 지속
                }
            }
            if (exit) break; //원소가 전부 1이면 while문 탈출
            answer++; //하루 추가
            
            for(int i=0;i<n;i++){
                garden[i]=nGarden[i].clone(); //deep copy
            }
                
        } //while문 끝
            
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
    }    
}
