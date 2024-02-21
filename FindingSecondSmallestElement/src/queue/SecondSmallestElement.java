package queue;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallestElement  {
	
	public static void getSecondSmallest(int n,ArrayList<Integer> arr) {
		
		Collections.sort(arr);	
		System.out.println(arr.get(1));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		getSecondSmallest(n,arr);	
		
	}

}
