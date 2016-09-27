import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class bernie {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		int i = Integer.parseInt(sc.nextLine());		
		
		for (int k = 0; k < i; k++){
			String aq = sc.nextLine();
			String[] a = aq.split("\\s+");
			
			int vv = Integer.parseInt(a[1]);
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if (map.get(a[0]) == null){
				temp.add(vv);
			}
			else{
				temp = map.get(a[0]);
				temp.add(vv);
			}
			map.put(a[0], temp);
		}
		
		i = Integer.parseInt(sc.nextLine());		
		for(Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			String key = entry.getKey();
			Collections.sort(entry.getValue());
		    map.put(key, entry.getValue());
		}
		
		
		for (int k = 0; k < i; k++){
			String aq = sc.nextLine();
			String[] a = aq.split("\\s+");
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = map.get(a[0]);
			System.out.println(temp.get(Integer.parseInt(a[1])-1));		
		}
	}




}
