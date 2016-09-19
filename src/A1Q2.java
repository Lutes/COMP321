import java.util.ArrayList;
import java.util.Random;

public class A1Q2 {
	public static void main(String args[]){
		int[] key = generateKey(5);
		String message = "Four score and seven years ago ey";
		printArray(key);
		printArray(encryptArray(key,(generateMessageArray(message, 5))));
		
	}
	
	public static char[] generateMessageArray(String message, int n){
		char[] temp = message.toCharArray();
		
		int spaces = 0;
		if (temp.length%n != 0){
			spaces = (((temp.length/n)*n)+n) - temp.length;			
		}

		char[] array = new char[(temp.length) + spaces];
		
		for (int i = 0; i < temp.length; i++){
			array[i] = temp[i];
		}
		
		for(int j = 0; j < spaces; j++){
			array[temp.length + j] = ' ';
		}
		return array;
	}
	
	public static char[] encryptArray(int[] key, char[] message){
		char[]encryptedArray = new char[message.length];
		ArrayList longKey = new ArrayList();
		
		for (int i = 0; i < (message.length/(key.length)); i++){
			for (int j = 0; j < key.length; j++){
				longKey.add(((key[j])+(key.length*i))-1);
			}
		}
		for (int x = 0; x< message.length; x++){
			encryptedArray[x] = message[(int)longKey.get(x)];
		}
		
		return encryptedArray;
	}
	
	public static int[] generateKey(int n){
		
		ArrayList list = new ArrayList( );
		int[] key = new int[n];
		Random rand = new Random();
		
		for (int i = 0; i < n; i++){
			list.add(i);
		}
		for(int j = 0; j < n; j++){
			int  ri = rand.nextInt(list.size());
			key[j] = ((int) list.get(ri)) + 1;
			list.remove(ri);
		}
		return key;
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

	public static void printArray(char[] array){
		System.out.println();
		System.out.print("[");
		for (int i = 0; i < array.length; i++){
		System.out.print( array[i] + ", " );	
		}
		System.out.print("]");
		System.out.println();
	}
	
	
}
