1차 기출(구름)

#### 해밍거리 
- str.charAt(i) 문자 같은지 비교할 때

        for(int i = 0; i < maxLength; i++)
            if(binaryA.charAt(i)!=binaryB.charAt(i))
                hammingDistance += 1;
        return hammingDistance;
