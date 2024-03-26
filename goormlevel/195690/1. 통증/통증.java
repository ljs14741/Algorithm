import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		
		if(num>13) {
			answer = answer + num/14;
			num = num%14;
			if(num>6) {
				answer = answer + num/7;
				num = num%7;
				if(num>0) {
					answer = answer + num;
				}
			} else {
					answer = answer + num;
				}
		} else if(num>6) {
			answer = answer + num/7;
				num = num%7;
				if(num>0) {
					answer = answer + num;
				}
		} else {
					answer = answer + num;
				}
		System.out.println(answer);
	}
}