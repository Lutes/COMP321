import java.util.Scanner;


public class simon {

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			int i = Integer.parseInt(sc.nextLine());			
			for (int k = 0; k < i; k++){
				String s = sc.nextLine();
				test(s);
			}
	}

	public static void test(String s){
		String[] ar = s.split("\\ ");
		String ans = "";

		if ((ar[0].equals("Simon"))&&(ar[1].equals("says"))){
			for (int i = 2; i < ar.length; i++){
				if (i == ar.length-1)
					ans = ans + ar[i];
				else{
					ans = ans + ar[i] + " ";	
				}
			}

		}
		if(ans != null){
			System.out.println(ans);
		}
		
		
	}

}
