package inheritance;

public class SenoirCitizen extends BankAccount {

	public SenoirCitizen(int withdrawAmount, int depoistAmount) {
		super(withdrawAmount, depoistAmount);
		// TODO Auto-generated constructor stub
		setInterstRate(10.5);
	}

}
