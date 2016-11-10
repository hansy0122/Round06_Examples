import java.io.*;
public class Round06_Ex02 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x1=0, x2=0;
		System.out.print("x1=?");
		x1=Integer.parseInt(in.readLine());
		System.out.print("x2=?");
		x2=Integer.parseInt(in.readLine());
		
		if(x1>x2)
		{ System.out.println("큰수는 "+x1+"입니다"); }
		else if(x1<x2)
		{ System.out.println("큰수는 "+x2+"입니다"); }
		else
		{ System.out.println("두수는 같습니다"); }
		
				
		
	}

}
