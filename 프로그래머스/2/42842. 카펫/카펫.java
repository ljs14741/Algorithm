class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        int garo = 0;
        int sero = 0;
        
        for(int i=3; i<1417; i++) {
            if(size%i == 0) {
                garo = size/i;
                sero = i;   
            }
            int tmp = (garo-2)*(sero-2);
            if(tmp != yellow) {
                continue;
            } else if(tmp == 4) {
                answer[0] = 4;
                answer[1] = 4;
                return answer;
            }          
            else {
                answer[0] = garo;
                answer[1] = sero;
                return answer;
            }
                        
        }
        
        return answer;
    }
}
