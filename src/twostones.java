import java.util.Scanner;


public class twostones{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();			
		for (int k = 0; k < i; k++){
			int s = sc.nextInt();
			if(s%2 == 0){
				System.out.println(s + " is even");
			}
			
			else{
				System.out.println(s + " is odd");
			}
		}
	}
}