import java.util.Scanner;


public class twostones{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		do{
			long i = sc.nextLong();
			long k = sc.nextLong();
			sc.nextLine();
			System.out.println(Math.abs(i-k));
		}while(sc.hasNext());
	}
}