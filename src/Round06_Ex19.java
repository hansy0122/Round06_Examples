import java.io.*;
public class Round06_Ex19 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��ϼ���:");
		int x=Integer.parseInt(in.readLine());
		
		//4�� ������ ������ 0�̸� ���� �� 100���� ����������� ����ƴ� �׷��� 400���� ������ �������� ����

		if(x%400==0){
			System.out.println("�����Դϴ�.");
		}
		else if(x%4==0 &&x%100!=0){
			System.out.println("�����Դϴ�.");
			
		}
		else{
			System.out.println("����ƴϾ�.");
		}
	}
}
