import java.util.ArrayList;
import java.util.Scanner;


public class everywhere {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i < x; i++){
			int y = sc.nextInt();
			
			sc.nextLine();
			ArrayList p = new ArrayList();
			for(int j = 0; j < y; j++){
				String in = sc.nextLine();
				if (!p.contains(in)){
					p.add(in);
				}
			}
			System.out.println(p.size());
		}
		
	}
}
