import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Round06_Ex14 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x1=0,x2=0,tot=0,n=0;
		
		System.out.print("x1의  값을 입력하세요 ");
		x1=Integer.parseInt(in.readLine());
		System.out.print("x2의  값을 입력하세요 ");
		x2=Integer.parseInt(in.readLine());
		System.out.print("n의  값을 입력하세요 ");
		n=Integer.parseInt(in.readLine());
		
		
		
		if(x1<x2){    //x1이 더 큰값.
			int imsi=x1;
			x1=x2;
			x2=imsi;
		}
		
		for(int i=x2;x1>=i;i++){
			if(i%n==0){
				tot+=i;
		}
		}
		
		System.out.print("x1~x2 사이의"+ n +"의 배수의 합은 "+tot+"입니다");
	}
}
