import java.io.*;
public class Round06_Ex20 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("±¸±¸´Ü");
		int x=Integer.parseInt(in.readLine());
		
		for(int i=1;i<10;i++){
			System.out.printf("%d * %d = %d \n",x,i,x*i);
		}
		
	}
}
