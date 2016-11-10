import java.io.*;

public class Round06_Ex17 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int x1=0,x2=0,x3=0,총점=0;
		double 평=0.0;
		String 학점="";
		
		System.out.println("자 너의 점수의 평균을 구해보자");
		System.out.println("단 과목점수는 0~100사이로 입력해라 아니면 다시입력하게 한다");
	
		do{
			System.out.print("국어점수 입력");
			x1=Integer.parseInt(in.readLine());
			
		}while(0>x1||x1>100);
		

		do{
			System.out.print("수학점수 입력");
			x2=Integer.parseInt(in.readLine());
			
		}while(0>x2||x2>100);
		

		do{
			System.out.print("영어점수 입력");
			x3=Integer.parseInt(in.readLine());
			
		}while(0>x3||x3>100);
		
		총점=x1+x2+x3;
		평=총점/3.0;
		
		if(평>=90.0){
			학점="A";
		}
		else if(평>=80){
			학점="B";
			
		}
		else if(평>=70){
			학점="C";
			
		}
		else {
			학점="F";
			
		}
		
		System.out.printf("국어 점수=%d\n수학점수=%d\n영어점수=%d\n총점=%d\n평균=%.2f\n",x1,x2,x3,총점,평);
		System.out.print(학점);
		
		
		
		
		
		
		
		
}
}