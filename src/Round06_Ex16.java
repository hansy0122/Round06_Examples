import java.io.*;
public class Round06_Ex16 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.print("����ҷ� ���� ? y/n �Է��غ�");
			int x=System.in.read();
			in.readLine();
			if(x=='n' || x=='N'){
				break;
			}
		}
		System.out.print("no ???? ���簡");
	}
}
