import java.util.*; //에러뜨면 import 해보자

class Solution {
    String[] alpha = {"A", "E", "I", "O", "U"};
    ArrayList<String> sazon; 
    //List 인터페이스를 구현한 클래스이기 때문에 저장된 값의 순서를 유지하고 중복을 허용한다. 
    
    public void create_words(int lev, String str) { //0,""
        sazon.add(str); //words.get(i) = "" : 첫번째(0) 값은 ""임
        for (int i = 0; i < 5; i++) {
            if (lev < 5) { //lev 0
                create_words(lev+1, str.concat(alpha[i])); //재귀함수
            }
            else break; // lev(문자길이) 5면 for문 탈출 굳이 i 다 돌필요없음.
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        sazon = new ArrayList<>();
        
        create_words(0, ""); //DFS 함수 호출
        
        for (int i = 0; i < sazon.size(); i++) {
            if (word.equals(sazon.get(i))) { //입력과 사전.get(i) 번째 값이 같으면
                answer = i; //i번째 값에 넣어주고
                break;
            }
        }
        return answer;
    }
}

