import java.util.Scanner;


public class B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String input;
		String[] temp = new String[5];
		double[] nums = new double[5];
		
		while (sc.hasNextLine()) {
		
			input = sc.nextLine();
			temp = input.split(" ");
			for (int i = 0; i < 5; i++) {
				nums[i] = Double.parseDouble(temp[i]);
			}
			
			double p = ((nums[1] - nums[0] + 1)/nums[1]); 
			double ans = (double)0;
			for (int i = (int)nums[2]; i <= (int)nums[3]; i++) {
				ans += choose(nums[3], (double)i)*Math.pow(p, (double)i)*Math.pow((1 - p), (nums[3] - (double)i));
			}
			
			if (1/nums[4] < ans) System.out.println("yes");
			else System.out.println("no");
		}
		
	}
	
	public static double choose(double n, double k) {
		return ((double)fact((int)n))/((double)fact((int)k)*((double)fact((int)(n-k))));
	}
	
	public static int fact(int n) {
		if (n == 0) return 1;
		else return n*fact(n-1);
	}
}
