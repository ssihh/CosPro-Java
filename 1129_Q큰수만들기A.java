// 풀이: https://ongveloper.tistory.com/98

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder(); // 생성자: StringBuilder() 16개의 문자들을 저장할 수 있는 초기버퍼 만듦
        
        for(int i=0, idx=-1; i<number.length()-k; i++){
            int max=0;
            for(int j=idx+1; j<=i+k; j++){
                if(max<number.charAt(j)-'0'){
                    max=number.charAt(j)-'0';
                    idx=j;
                }
            }
            answer.append(max); //append int형도되네 굳이 string형으로 안바꿔도됨
        }
        
        return answer.toString();
    }
}
