import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Integer[] convB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(convB,Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++) {
            answer = answer + (A[i] * convB[i]);
        }        

        return answer;
    }
}