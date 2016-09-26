import java.util.ArrayList;
import java.util.Scanner;


public class natjecanje {
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
			
		int a = 0;
		int b = 0;
		int c = 0;
		ArrayList<Integer> broke = new ArrayList();
		ArrayList<Integer> res = new ArrayList();
		for(int i = 0; i < 3; i++){	
			if(i == 0){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
			}
			if(i == 1){
				for(int x = 0; x < b; x++){
					broke.add(sc.nextInt());
				}
			}
			if(i == 2){
				for(int x = 0; x < c; x++){
					res.add(sc.nextInt());
				}
			}
		}
		
		//***********************************
		
		int can = 0;
		for(int i = 0; i < a; i++){
			if(broke.contains(i+1)){
				if (res.contains(i)){
					broke.remove(broke.indexOf(i+1));
					
					res.remove(res.indexOf(i));
					can++;
				}
				else if(res.contains(i+2)){
					broke.remove(broke.indexOf(i+1));
					res.remove(res.indexOf(i+2));
					can++;
				}
			}
		}
		System.out.println(b - can);
			
			
			
			
		};
}
