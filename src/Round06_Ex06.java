import java.io.*;
public class Round06_Ex06 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x=0,y=0,t=0;
		int dus=0;
		System.out.print("x를 입력하세요:");
		x=Integer.parseInt(in.readLine());
		System.out.print("연산자를 입력하세요(+,-,*,/):");
		dus= System.in.read();
				in.readLine();
		System.out.print("y를 입력하세요:");
		y=Integer.parseInt(in.readLine());
		switch(dus){
		case '+': t=x+y; break;
		case '-': t=x-y; break;
		case '*': t=x*y; break;
		case '/': t=x/y; break;
		default: System.out.println("잘못된 연산자 입력");
		System.exit(-1);
		
		}
		System.out.println(x+""+(char)dus+y+"="+t);
		
		
	}
	}

