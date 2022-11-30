import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient) {
            stack.push(i);
            
            if(stack.size() >= 4) { //끝 네개로 햄버거를 만들 수 있는지 검사
                if(stack.elementAt(stack.size()-4) == 1
                    && stack.elementAt(stack.size()-3) == 2
                    && stack.elementAt(stack.size()-2) == 3
                    && stack.elementAt(stack.size()-1) == 1 ) {
                    
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    answer++;
                }
            }
        }
        return answer;

    }
}