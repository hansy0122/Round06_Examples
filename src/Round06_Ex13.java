import java.io.*;
public class Round06_Ex13 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x1=0,x2=0,tot=0;
		
		System.out.print("x1��  ���� �Է��ϼ��� ");
		x1=Integer.parseInt(in.readLine());
		System.out.print("x2��  ���� �Է��ϼ��� ");
		x2=Integer.parseInt(in.readLine());
		
		
		
		
		if(x1<x2){    //x1�� �� ū��.
			int imsi=x1;
			x1=x2;
			x2=imsi;
		}
		
		for(int i=x2;x1>=i;i++){
			tot+=i;
		}
		
		System.out.print("x1~x2 ������ ��� ������ ���� "+tot+"�Դϴ�");
	}
}
