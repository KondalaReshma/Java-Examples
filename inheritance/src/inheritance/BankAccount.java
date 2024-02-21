package inheritance;

public class BankAccount {
	  private int withdrawAmount;
	  private int depoistAmount;
	  private double interstRate =9.5;
	  private int balance;
	  
      public BankAccount(int withdrawAmount, int depoistAmount) {
		super();
		this.withdrawAmount = withdrawAmount;
		this.depoistAmount = depoistAmount;
	}
	void depoistMoney()
      {
    	  System.out.println("depoist money" + depoistAmount);
    	  
      }
      void withdrawMoney() {
    	  
    	  System.out.println ("withdraw money" + withdrawAmount);
    	  balance = depoistAmount - withdrawAmount;
    	  System.out.println("balance"  + balance);
    	  
      }
	public double getInterstRate() {
		return interstRate;
	}
	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}
	
	
}
