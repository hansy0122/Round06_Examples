import java.io.*;
public class Round06_Ex04 {
	public static void main(String[] ar) throws IOException {
		System.out.print("수를 하나 입력하세요");
		char x1=(char)System.in.read();
		
		switch(x1){
		case '0' : System.out.print("서울출신"); break;
		case '1' : System.out.print("경기출신"); break;
		case '2' : System.out.print("경남출신");break;
		case '3' : System.out.print("제주출신");break;
		default : System.out.print("error");break;
		
		}
	}

}
