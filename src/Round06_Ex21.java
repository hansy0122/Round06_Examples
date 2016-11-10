import java.io.*;
public class Round06_Ex21 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		char x='y';
		for(;x=='y'||x=='Y';){System.out.print("첫 번째 수:");
		int a=Integer.parseInt(in.readLine());
		int c=0;
		char b='k';
		while(true){
		System.out.print("연산자:");
		b=(char) System.in.read();
		in.readLine();
		
		if(b=='+'||b=='-'||b=='*'||b=='/'){
			break;
		} else{
			System.out.println("연산자가 올바르지 않습니다. 다시입력하세요");
		}
		}
		while(true){
		System.out.print("두 번째 수:");
		c=Integer.parseInt(in.readLine());
		if(b=='/' && c==0){
			System.out.println("0으로 나눌수 없습니다.");
			continue;
			
		} break; 
		}
		
		
		int t=0;
		
		switch(b){
		case('+'): t=a+c;break;
		case('-'): t=a-c;break;
		case('*'): t=a*c;break;
		case('/'): t=a/c;break;
		default: System.out.print("연산자가 올바르지 않습니다."); System.exit(-1);
		}
		System.out.println(""+a+b+c+"="+t);
		System.out.print("계속하시겠습니까? Y/ N");
		x=(char) System.in.read();
		in.readLine();
		
		if(x=='n'||x=='N'){
			System.out.println("감사합니다");
			System.exit(-1);
		} else if(x=='y'||x=='Y'){
			continue;
		} else{
			System.out.println("Y 혹은 N로 대답하세요");
			System.out.print("계속하시겠습니까? Y/ N");
			x=(char) System.in.read();
			in.readLine();
			
		}
		
		
	}
}
} 