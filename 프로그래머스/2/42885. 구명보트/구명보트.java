import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        /* people 배열 오름차순 정렬 */
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        
        while(true) {
            int sum = 0;
            if(people[right] + people[left] > limit) {
                right = right - 1;
                answer = answer +1;
                if(right <= left) {
                    answer = answer + 1;
                    break;
                }
            } else {
                answer = answer + 1;
                right = right - 1;
                if(right <= left) {
                    break;
                }
                left = left + 1;
            }
        }
        
        return answer;
    }
}