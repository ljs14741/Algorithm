import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String x = Integer.toString(n);
        char y;
        System.out.println("x: " + x);
        for(int i=0; i<x.length(); i++) {
            y = x.charAt(i);
            int z = Character.getNumericValue(y);
            answer = answer + z;
        }       

        return answer;
    }
}