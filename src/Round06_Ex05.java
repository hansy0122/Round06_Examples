import java.io.*;
public class Round06_Ex05 {
	public static void main(String[] ar)throws IOException{
		int x=0;
		String sus="";
		String tjd="";
		int y=0;
		
		System.out.print("주민등록번호 7번째 자리는 ?");
		x=System.in.read()-48;
		
		switch(x){
		case 9: case 0:sus="1800";break;
		case 1: case 2:sus="1900";break;
		case 3: case 4:sus="2000";break;
		default: System.out.println("잘못입력하셨습니다");
				y=-1;
				
		
		
		}
		switch(x%2){
		case 0: tjd="여성"; break;
		case 1: tjd="남성"; break;
		}
		
		if(y!=-1)
		System.out.print("당신은"+sus+"년대"+tjd+"입니다");
		
		
		
		
	}

}
