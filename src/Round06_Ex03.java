import java.io.*;
public class Round06_Ex03 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x1=0, x2=0,x3=0;
		System.out.print("x1=");
		x1= Integer.parseInt(in.readLine());
		System.out.print("x2=");
		x2= Integer.parseInt(in.readLine());
		System.out.print("x3=");
		x3= Integer.parseInt(in.readLine());
		
		if(x2>x1 && x2>x3) {
			int imsi= x1;
			x1=x2;
			x2=imsi;
		}
		else if(x3>x1 && x3>x2) {
			int imsi= x1;
			x1=x3;
			x3=imsi;
		}
			if(x3>x2){
				int imsi=x2;
				x2=x3;
				x3=imsi;
			}
			
			System.out.println(x1+">="+x2+">="+x3);
			
		
		
				
	}
	

}
