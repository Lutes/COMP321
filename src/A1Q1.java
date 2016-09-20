import java.io.*;
import java.util.Scanner;

public class A1Q1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
		   int number = sc.nextInt();
		   solve(number);
		}
	}	
	
	public static void solve(int number){		
		int sum = sumInt(number);
		int solution = 0;
		
		if((0 != sum)){
			for (int i = 11; i < 100000; i++){
				if (sumInt(i * number) == sum){
					solution = i;
					break;
				}
			}			
			System.out.println(solution);
		}
	}

	
	public static int[] intToArray(int number){
		String temp = Integer.toString(number);
		int[] array = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    array[i] = temp.charAt(i) - '0';
		}
		return array;
	}
	
	public static int sumInt(int number){
		int sum = 0;
		int [] array = intToArray(number);
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum;
	}
	
	public static void printArray(int[] array){
		System.out.println();
		System.out.print("[");
		for (int i = 0; i < array.length; i++){
		System.out.print( array[i] + ", " );	
		}
		System.out.print("]");
		System.out.println();
	}
}
