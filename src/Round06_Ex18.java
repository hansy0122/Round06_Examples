import java.io.*;
public class Round06_Ex18 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�빮�� ���� �ҹ������� �ϳ��� �ĺ�!");
		char a= (char)System.in.read();
		in.readLine();
		
		if(a>='a'&&a<='z'){
			System.out.print("�ҹ���");
		}

		else if(a>='A'&&a<='Z'){
			System.out.print("�빮��");
		}
		
		
	}
}
