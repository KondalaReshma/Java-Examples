package complexnumber;

public class Complexclass {
	
	double realpart;
	double imaginarypart;
	
	void initialise(double i,double j) {
		this.realpart = i;
		this.imaginarypart = j;
		}
	void print() {
		System.out.println("complexnumber is"+ realpart + "+"+"i" +imaginarypart);
	}


}
