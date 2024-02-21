package ifElseExample;
import java.util.*;
public class Electricity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer number");
		int customerno = sc.nextInt();
		System.out.println("Enter meter readings of previous month");
		int previousreadings=sc.nextInt();
		System.out.println("Enter meter readings of current month");
		int currentreadings=sc.nextInt();
		int unitsconsumed = previousreadings-currentreadings;
		System.out.println("units conusumed = " + unitsconsumed);
		int totalcharges=0;
		if(unitsconsumed<=100)
		{
			totalcharges=unitsconsumed*5;
			System.out.println("totalcharges" + totalcharges);
			
		}
		else if(unitsconsumed>=200 && unitsconsumed<300) {
			totalcharges = 500+(unitsconsumed-100)*6;
			System.out.println("totalcharges" + totalcharges);
			}
		else if(unitsconsumed>=300 && unitsconsumed <400 ) {
			totalcharges = 500+600+(unitsconsumed-200)*7;
			System.out.println("totalcharges" + totalcharges);
			}
		else if(unitsconsumed>=400  ) {
			totalcharges = 500+600+700+(unitsconsumed-300)*8;
			System.out.println("totalcharges" + totalcharges);
			}
		
	}

}
