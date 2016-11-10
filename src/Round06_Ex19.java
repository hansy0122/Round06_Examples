import java.io.*;
public class Round06_Ex19 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("연도를 입력하세요:");
		int x=Integer.parseInt(in.readLine());
		
		//4로 나눠서 나머지 0이면 윤년 단 100으로 나누어떨어지면 윤년아님 그러나 400으로 나누어 떨어지면 윤년

		if(x%400==0){
			System.out.println("윤년입니다.");
		}
		else if(x%4==0 &&x%100!=0){
			System.out.println("윤년입니다.");
			
		}
		else{
			System.out.println("윤년아니야.");
		}
	}
}
