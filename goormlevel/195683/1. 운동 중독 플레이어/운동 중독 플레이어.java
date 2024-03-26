import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String arr[] = input.split(" ");
		double answer = 0;
	
		
		answer = Integer.parseInt(arr[0]) * (1 + Integer.parseInt(arr[1])/30.0);
		int result = (int) Math.floor(answer);
		System.out.println(result);	
		
		
		
	}
}