import java.util.Scanner;

public class bijele {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split("\\s+");
		String[] c = new String[]{"1","1","2","2","2","8"};
		int[] ar = new int[c.length];
		for(int i = 0; i < c.length; i++){
			ar[i] = Integer.parseInt(c[i]) - Integer.parseInt(b[i]);
		}
		
		for(int x = 0; x < c.length; x++){
			if (c.length-1 == x){
				System.out.print(ar[x]);
			}
			else {
				System.out.print(ar[x] + " ");	
			}
			
		}
	}
	
}
