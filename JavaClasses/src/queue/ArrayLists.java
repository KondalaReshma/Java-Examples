package queue;
import java.util.*;


public class ArrayLists {
	
	public  static ArrayList removeElements(ArrayList arr1, ArrayList arr2) {
		
	
				arr1.removeAll(arr2);
				
				return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		
		
		removeElements(arr1, arr2);
		System.out.println(arr1);
		
		
		
		
		
		
		

	}

}
