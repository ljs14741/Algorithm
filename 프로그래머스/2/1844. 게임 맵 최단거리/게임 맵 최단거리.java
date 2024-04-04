import java.util.*;

class Solution {
    
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1}; // 아래, 오른쪽, 위, 왼쪽 배열기준
    static int[] dy = {1,0,-1,0};
    static int[][] A;
    
    public int solution(int[][] maps) {
        int answer = 0;
        A = new int[maps.length][maps[0].length];
        
        visited = new boolean[maps.length][];
        
        for(int i=0; i<maps.length; i++) {
            visited[i] = new boolean[maps[i].length];
        }
        
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[i].length; j++) {
                A[i][j] = maps[i][j];
            }
        }
        
        bfs(0,0);
        
        // for(int i=0; i<maps.length; i++) {
        //     for(int j=0; j<maps[i].length; j++) {
        //         System.out.println("i" + i + " j" +j + " = " + A[i][j]);
        //     }
        // }
        
        if(A[maps.length-1][maps[maps.length-1].length-1] == 1) {
            return -1;
        }
        
        return A[maps.length-1][maps[maps.length-1].length-1];
    }
    
    public void bfs(int i, int j) {
        visited[i][j] = true;
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            for(int k=0; k<4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < A.length && y < A[0].length ) {
                    if(A[x][y] !=0 && !visited[x][y]) {
                        // System.out.println("111");
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] +1;
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
            
        // 상하좌우를 선택해서 하나씩 나아가야하는데 
        // 첫째줄
    }
}