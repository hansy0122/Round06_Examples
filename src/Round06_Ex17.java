import java.io.*;

public class Round06_Ex17 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x1=0,x2=0,x3=0,����=0;
		double ��=0.0;
		String ����="";
		
		System.out.println("�� ���� ������ ����� ���غ���");
		System.out.println("�� ���������� 0~100���̷� �Է��ض� �ƴϸ� �ٽ��Է��ϰ� �Ѵ�");
	
		do{
			System.out.print("�������� �Է�");
			x1=Integer.parseInt(in.readLine());
			
		}while(0>x1||x1>100);
		

		do{
			System.out.print("�������� �Է�");
			x2=Integer.parseInt(in.readLine());
			
		}while(0>x2||x2>100);
		

		do{
			System.out.print("�������� �Է�");
			x3=Integer.parseInt(in.readLine());
			
		}while(0>x3||x3>100);
		
		����=x1+x2+x3;
		��=����/3.0;
		
		if(��>=90.0){
			����="A";
		}
		else if(��>=80){
			����="B";
			
		}
		else if(��>=70){
			����="C";
			
		}
		else {
			����="F";
			
		}
		
		System.out.printf("���� ����=%d\n��������=%d\n��������=%d\n����=%d\n���=%.2f\n",x1,x2,x3,����,��);
		System.out.print(����);
		
		
		
		
		
		
		
		
}
}