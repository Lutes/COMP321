import java.util.Scanner;


public class logo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++){
			int directions = sc.nextInt();
			double x = 0;
			double y = 0;
			
			double angle = 0;
			for(int j = 0; j < directions; j++){
				String instruction = sc.next();
				int value = sc.nextInt();
				
				if(instruction.equals("fd")){
					y += Math.cos(Math.toRadians(angle)) * -value;
					x += Math.sin(Math.toRadians(angle)) * -value;
				}
				
				else if(instruction.equals("bk")){
					y += Math.cos(Math.toRadians(angle)) * (value);
					x += Math.sin(Math.toRadians(angle)) * (value);
				}
				
				else if(instruction.equals("lt")){
					angle += value;
					angle = (angle % 360 + 360) % 360;
				}
				
				else if(instruction.equals("rt")){
					angle -= value;
					angle = (angle % 360 + 360) % 360;
				}
			}
			System.out.println(Math.round(Math.hypot(x, y)));
		}
	}
}