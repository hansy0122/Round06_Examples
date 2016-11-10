import java.io.*;
public class Round06_Ex22 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int year=0, m=0, base=2012,start=1, end=0;
		boolean bool=false;
		do{
		System.out.print("�⵵�� 4�ڸ��� �Է��ϼ���:");
		year=Integer.parseInt(in.readLine()); } while(!(0000<=year&&year<=9999));
		
		do{	
		System.out.print("�����Է��ϼ���:");
		m=Integer.parseInt(in.readLine()); } while(!(1<=m&&m<=12));
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
			bool = true;		
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: end = 31; break;
		case 4: case 6: case 9: case 11: end = 30; break;
		case 2: if(bool) end = 29; else end = 28;
		}

		if(year>=base){
			start+=365*(year-base);
			for(int i=base;i<year;i++){
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
					start++;
				}
				
			}
			
			for(int i=1;i<m;i++){
				
				switch(i) {
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: start+=31; break;
				case 4: case 6: case 9: case 11: start+= 30; break;
				case 2: if(bool) start+= 29; else start+=28;                     //start �� ����
				}
				
			}
			System.out.println(start);
			System.out.println("==================== <"+year+"�� "+m+"�� >======================");
			System.out.println("��\t�� \tȭ\t��\t��\t��\t��");
			
			if((start%7)==0){
				System.out.print(" \t \t \t \t \t \t");
			} 
			else{
			for(int i=1;(start%7)>i;i++){
				System.out.print(" \t");
			
			}
			}                                                                       //�ʱ� ��ġ����
				for(int i=1;i<=end;i++){ 
					System.out.print(i+"\t");
					if((start+i-1)%7==0){
						System.out.print("\n");
					}
						
				}
			
				System.out.print("\n======================================================");  
			
		}
		
		else{                                               //year<base

			start+=365*(year-base);
			for(int i=year;i<base;i++){
				if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
					start--;
				}
				
			}
			
			for(int i=1;i<m;i++){
				
				switch(i) {
				case 1: case 3: case 5: case 7: case 8:
				case 10: case 12: start+=31; break;
				case 4: case 6: case 9: case 11: start+= 30; break;
				case 2: if(bool) start+= 29; else start+=28;                     //start �� ����
				}
				
			}
			System.out.println(start);        //���� ���߳� Ȯ�ο뵵
			System.out.println("==================== <"+year+"�� "+m+"�� >======================");
			System.out.println("��\t�� \tȭ\t��\t��\t��\t��");
			
			if(((-start)%7)==0){
				System.out.print(" \t \t \t \t \t \t");
			} 
			else{
			for(int i=1;7-((-start)%7)>i;i++){
				System.out.print(" \t");
			
			}
			}                                                                       //�ʱ� ��ġ����
				for(int i=1;i<=end;i++){ 
					System.out.print(i+"\t");
					if(-(start+i-1)%7==0){
						System.out.print("\n");
					}
						
				}
			
				System.out.print("\n======================================================");  
			
			
		}
		
		
		
		
		
		
		/*
	
		System.out.println("==================== <"+year+"�� "+m+"�� >======================");
		System.out.println("��\t�� \tȭ\t��\t��\t��\t��");
		if(year-base==0 && m==1){
			for(;start<=end;start++){
				
				if(start/7-k==1) {
					
					System.out.println();
					k++;
						
				}
					
				
			
				if(start%7==1)
				System.out.print("     \t\t\t\t\t"+start);
				else if(start%7==2)
				System.out.print(" \t"+start);
				else if(start%7==3)
				System.out.print(+start);
				else if(start%7==4)
				System.out.print(" \t"+start);
				else if(start%7==5)
				System.out.print("  \t\t"+start);
				else if(start%7==6)
				System.out.print("   \t\t\t"+start);
				else if(start%7==0)
				System.out.print("    \t\t\t\t"+start);
				}
			}
			
		
			
		System.out.print("\n======================================================");        */
		
	}
}
