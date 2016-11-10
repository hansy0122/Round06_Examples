	
public class Round06_Ex08 {
	public static void main(String[] ar){
		
		for(char i='A';i<='Z';i++){
			System.out.print(i+": ");
			for(int k=0;k<i-64;k++){
				System.out.print(" ");
				}
			
			
			
			for(char j=(char)('A'+i-65);j<='Z'-i+65;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
