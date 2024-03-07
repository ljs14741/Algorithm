import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        String[] strArr;
        Stack<String> stack = new Stack<>();
        
        strArr = s.split("");
        
        /* 스택에 하나 넣은 후 */
        for(int i=0; i<strArr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(strArr[i]);
            } else {
                /* 문자열이 동일하면 스택 제거 */
                /* 문자열이 동일하지 않으면 스택 추가 */
                if(stack.peek().equals(strArr[i])) {
                    stack.pop();
                } else {
                    stack.push(strArr[i]);
                }
            }            
        }

        return stack.isEmpty() ? 1 : 0;
    }
}