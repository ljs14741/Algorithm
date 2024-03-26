import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String arr[] = input.split(" ");
		double answer = 0;
	
		
		answer = Double.parseDouble(arr[0]) * (1 + Double.parseDouble(arr[1])/30);
		int result = (int) Math.floor(answer);
		System.out.println(result);	
		
		
		
	}
}