import java.io.*;
public class Round06_Ex06 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x=0,y=0,t=0;
		int dus=0;
		System.out.print("x�� �Է��ϼ���:");
		x=Integer.parseInt(in.readLine());
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/):");
		dus= System.in.read();
				in.readLine();
		System.out.print("y�� �Է��ϼ���:");
		y=Integer.parseInt(in.readLine());
		switch(dus){
		case '+': t=x+y; break;
		case '-': t=x-y; break;
		case '*': t=x*y; break;
		case '/': t=x/y; break;
		default: System.out.println("�߸��� ������ �Է�");
		System.exit(-1);
		
		}
		System.out.println(x+""+(char)dus+y+"="+t);
		
		
	}
	}

