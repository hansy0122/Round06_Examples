import java.io.*;
public class Round06_Ex05 {
	public static void main(String[] ar)throws IOException{
		int x=0;
		String sus="";
		String tjd="";
		int y=0;
		
		System.out.print("�ֹε�Ϲ�ȣ 7��° �ڸ��� ?");
		x=System.in.read()-48;
		
		switch(x){
		case 9: case 0:sus="1800";break;
		case 1: case 2:sus="1900";break;
		case 3: case 4:sus="2000";break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�");
				y=-1;
				
		
		
		}
		switch(x%2){
		case 0: tjd="����"; break;
		case 1: tjd="����"; break;
		}
		
		if(y!=-1)
		System.out.print("�����"+sus+"���"+tjd+"�Դϴ�");
		
		
		
		
	}

}
