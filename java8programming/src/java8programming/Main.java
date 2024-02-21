package java8programming;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "Welcome to new world of lamdas";
		Printable p = new Printable() {
			public void print() {
				System.out.println(message);
			}
	};
	
	p.print();

}
	}
