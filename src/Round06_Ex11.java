
public class Round06_Ex11 {

	public static void main(String[] ar){
		
		han: for(int a=0; a<5;a++){
			seu: for(int b=0;b<3;b++){
				if(b==1){
					continue han;
				}
				System.out.print("*");
			}
					System.out.println();
		}
		
	}
}


