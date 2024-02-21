package inheritance;

public class BankAccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NRIAccounts nri = new NRIAccounts(500000,2000);
		nri.depoistMoney();
		nri.getInterstRate();
		nri.withdrawMoney();
		SenoirCitizen sc = new SenoirCitizen(70000,8000);
		sc.depoistMoney();
		sc.getInterstRate();
		sc.withdrawMoney();
		

	}

}
