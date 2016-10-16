import java.util.Scanner;


public class jabuke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		
		x = (double) sc.nextInt();
		y = (double) sc.nextInt();
		Tuple a = new Tuple(x,y);
		
		x = (double) sc.nextInt();
		y = (double) sc.nextInt();
		Tuple b = new Tuple(x, y);
		
		x = (double) sc.nextInt();
		y = (double) sc.nextInt();
		Tuple c = new Tuple(x, y);
				
		double area = Math.abs((a.x*(b.y-c.y))+(b.x*(c.y-a.y))+(c.x*(a.y-b.y)))/2.0;
		System.out.println(area);
		int trees = sc.nextInt();

		int treeCount = 0;
		for(int i = 0; i < trees; i++){
			double tx = sc.nextDouble();
			double ty = sc.nextDouble();
			
			double rep1 = triangleArea(tx,ty,b.x,b.y,c.x,c.y);
		    double rep2 = triangleArea(a.x,a.y,tx,ty,c.x,c.y);
		    double rep3 = triangleArea(a.x,a.y,b.x,b.y,tx,ty);

		      if (area == rep1+rep2+rep3)
		        treeCount++;
		    }

		System.out.println(treeCount);		
		}
		
		
	


	static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
    return Math.abs(x1 * (y2 - y3) + x2*(y3-y1) + x3*(y1 - y2)) / 2.0;
  }
}

