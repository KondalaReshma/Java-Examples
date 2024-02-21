package queue;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class SquaresOfNumber {

	public static void main(String[] args) {		
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		Scanner scn= new Scanner(System.in);
		
		while(scn.hasNextInt()){
			int n = scn.nextInt();
			map.put(n, n*n);
		}
		map.forEach((k,v)-> System.out.println("{"+k +" "+v+"}"));
		
	} 
} 