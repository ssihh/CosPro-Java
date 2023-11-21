import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
       
        HashSet<Integer> hashset = new HashSet<>();
        for(int i =0; i<hashset.size()-1; i++)
            for(int j=i+1; j<hashset.size(); j++){
                hashset.add(numbers[i]+numbers[j]);
            }
        
        
        int[] answer = new int[hashset.size()];
        Iterator iterator = hashset.iterator();

        for (int j=0; j< hashset.size(); j++){
            answer[j] = (int)iterator.next();
        }
        
        
        return answer;
    }
}
