import java.util.*; // 이유모를 에러뜨면 import 해보자

class Solution {
    
    String[] alpha = {"A", "E", "I", "O", "U"};
    ArrayList<String> sazon = new ArrayList<>(); //List 인터페이스를 구현한 클래스이기 때문에 저장된 값의 순서를 유지하고 중복을 허용한다. 
    
    public void DFS(int len, String str){
        sazon.add(str); //사전에 값추가. //words.get(i) = "" : 첫번째(0) 값은 ""임
          
        for(int i=0; i<5; i++){
            if(len<5){
                DFS(len+1, str.concat(alpha[i]));
            }
            else{
                break; // lev(문자길이) 5면 for문 탈출 굳이 i 다 돌필요없음.
            }
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        
        DFS(0, ""); //0번째값 공란. DFS 함수 호출
        
        for(int i=0; i<sazon.size(); i++){ //입력과 사전.get(i) 번째 값이 같으면
            if(word.equals(sazon.get(i))){ //i번째 값에 넣어주고
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
