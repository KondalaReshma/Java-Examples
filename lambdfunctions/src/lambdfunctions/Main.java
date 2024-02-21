package lambdfunctions;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calculator ar = (principalvalue,rateofinterest,timeperiod)->(principalvalue *rateofinterest *timeperiod);
		
		 System.out.println("Enter principalvalue :");
         double p=sc.nextDouble();
         System.out.println("Enter rateofinterest :");
         double r=sc.nextDouble();
         System.out.println("Enter timeperiod :");
         double t=sc.nextDouble();
         System.out.println("simple initerest  = " + ar.SiCalculator(p,r,t));
		

	}

}
