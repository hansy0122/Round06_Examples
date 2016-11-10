import java.io.*;
public class Round06_Ex15 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true){
			System.out.print("숫자를 입력하세요");
			int x=Integer.parseInt(in.readLine());
			if(x%2==0){
				break;
				
			}
		}
		System.out.print("짝수를 입력한 당신은 패배자!");
		
		
	}
}
