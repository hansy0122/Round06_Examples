import java.io.*;
public class Round06_Ex18 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("대문자 인지 소문자인지 하나만 쳐봐!");
		char a= (char)System.in.read();
		in.readLine();
		
		if(a>='a'&&a<='z'){
			System.out.print("소문자");
		}

		else if(a>='A'&&a<='Z'){
			System.out.print("대문자");
		}
		
		
	}
}
