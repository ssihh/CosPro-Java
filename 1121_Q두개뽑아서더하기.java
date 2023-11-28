import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
       
        HashSet<Integer> hashset = new HashSet<>();
        for(int i =0; i<numbers.length-1; i++) //배열크기, hasgset크기 아님!
            for(int j=i+1; j<numbers.length; j++){
                hashset.add(numbers[i]+numbers[j]); //hashset에 값 추가
            }
        
        
        int[] answer = new int[hashset.size()];
        Iterator iterator = hashset.iterator(); //hashset.에 쓰일 Iterator()선언 

        // for (int j=0; j< hashset.size(); j++){
        //     answer[j] = (int)iterator.next();
        // }
        
        int k=0;
        while(iterator.hasNext()){
            answer[k++]=(int)iterator.next(); //(int)형변환
        }

        //오름차순 정렬. hashset은 HashSize가 디폴트값인 16단위로 관리됨. 17이있었다면 1옆에 있었을 것
        Arrays.sort(answer); 
        return answer;
    }
}
