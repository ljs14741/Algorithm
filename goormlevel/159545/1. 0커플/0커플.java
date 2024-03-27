import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		String input = br.readLine();
		String[] arr = input.split(" ");
		int result = 0;
		
		for(int i=0; i<N; i++) {
			result = result + Integer.parseInt(arr[i]);
		}
		
		System.out.println(result);
	}
}