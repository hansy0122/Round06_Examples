import java.io.*;
public class Round06_Ex21 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		char x='y';
		for(;x=='y'||x=='Y';){System.out.print("ù ��° ��:");
		int a=Integer.parseInt(in.readLine());
		int c=0;
		char b='k';
		while(true){
		System.out.print("������:");
		b=(char) System.in.read();
		in.readLine();
		
		if(b=='+'||b=='-'||b=='*'||b=='/'){
			break;
		} else{
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�. �ٽ��Է��ϼ���");
		}
		}
		while(true){
		System.out.print("�� ��° ��:");
		c=Integer.parseInt(in.readLine());
		if(b=='/' && c==0){
			System.out.println("0���� ������ �����ϴ�.");
			continue;
			
		} break; 
		}
		
		
		int t=0;
		
		switch(b){
		case('+'): t=a+c;break;
		case('-'): t=a-c;break;
		case('*'): t=a*c;break;
		case('/'): t=a/c;break;
		default: System.out.print("�����ڰ� �ùٸ��� �ʽ��ϴ�."); System.exit(-1);
		}
		System.out.println(""+a+b+c+"="+t);
		System.out.print("����Ͻðڽ��ϱ�? Y/ N");
		x=(char) System.in.read();
		in.readLine();
		
		if(x=='n'||x=='N'){
			System.out.println("�����մϴ�");
			System.exit(-1);
		} else if(x=='y'||x=='Y'){
			continue;
		} else{
			System.out.println("Y Ȥ�� N�� ����ϼ���");
			System.out.print("����Ͻðڽ��ϱ�? Y/ N");
			x=(char) System.in.read();
			in.readLine();
			
		}
		
		
	}
}
} 