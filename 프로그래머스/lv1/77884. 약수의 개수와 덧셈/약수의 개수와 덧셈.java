import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<= right; i++) {
            if(decimal_count(i)%2 == 0) { //약수의 수가 짝수
                answer += i;
            }
            else    //약수의 수가 홀수
                answer -= i;
        }
        
        return answer;
    }
    
    public int decimal_count(int num) { //약수의 개수 세기
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) count++;
            else if (num % i == 0) count += 2;
        }
        return count;
}
}