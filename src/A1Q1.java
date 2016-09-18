public class A1Q1 {
	public static void main(String args[]){
		System.out.println(sumArray(convertNumberToArray(231)));
	}
	
	public static int[] convertNumberToArray(int number){
		String temp = Integer.toString(number);
		int[] array = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    array[i] = temp.charAt(i) - '0';
		}
		return array;
	}
	
	public static int sumArray(int[] array){
		int sum = 0;
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
