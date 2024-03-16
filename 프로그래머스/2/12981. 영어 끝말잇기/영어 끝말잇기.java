import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int tmp = 0;
        
        Stack<String> stack = new Stack<>();

        for(int i=0; i<words.length; i++) {
            
            stack.push(words[i]);
            if(i == words.length-1) {
                break;
            }  
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                
                System.out.println("i: " + i);
                System.out.println("n: " + n);
                System.out.println("i/n: " + (i/n));
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                tmp = tmp+1;
                break;
            }   
            if(i>0 && stack.contains(words[i+1])) {                
                System.out.println("i: " + i);
                System.out.println("n: " + n);
                System.out.println("words[i+1]: " + words[i+1]);
                answer[0] = ((i+1)%n) + 1;
                answer[1] = ((i+1)/n) + 1;
                tmp = tmp+1;
                break;
            }
        }
        
        
        if(tmp == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }

        return answer;
    }
}