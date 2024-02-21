package AggregationExample;

public class Test {

	public static void main(String[] args) {
		sim s = new sim(1,1000,"jio");
		mobilephone mp =  new mobilephone("samsung","s20","4","128gb","navy blue",s);
		System.out.println("sim number" + s.getNumber() );
		System.out.println("sim serialnumber" + s.getSerialNumber());
		System.out.println("sim provider " + s.getProvider() );
		System.out.println("brand of mobile phone " +mp.getBrand() );
		System.out.println("model of mobile phone " +  mp.getModel());
		System.out.println("display of mobile phone" + mp.getDisplay());
		System.out.println("memory of mobile phone" +mp.getMemory() );
		System.out.println("color of mobile phone" +mp.getColor() );
		System.out.println("sim of mobile phone" + mp.getSim());
		

	}

}
