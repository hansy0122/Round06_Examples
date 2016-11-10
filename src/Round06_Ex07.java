
public class Round06_Ex07 {
	public static void main(String[] ar) {
		int z=0;
		for(int i=0,y=0; i<=10;i++){
			System.out.println(i);
			z=z+i;
			y+=i;
			if(y==55)
				System.out.println(y);
		}
		System.out.println(z);
	}
}
