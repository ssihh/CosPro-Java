class Main {
    public long solution(long num) {
        
        long answer = 0;
				num ++;
				String snum = Long.toString(num);
				String new_snum = "";	
			
			for(int i=0; i<snum.length(); i++){
				if(snum.charAt(i)=='0'){
					new_snum += "1";
				}
				else{
					new_snum += snum.charAt(i);
				}
			}
			  answer = Long.parseLong(new_snum);
			
			
        return answer;
    }
