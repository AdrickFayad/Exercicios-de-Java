package entities;

public class SavingAccount extends Account {

	private Double intersetRate;
	
	public SavingAccount () {
		
	}

	public SavingAccount(Integer number, String holder, Double balance, Double intersetRate) {
		super(number, holder, balance);
		this.intersetRate = intersetRate;
	}

	public Double getIntersetRate() {
		return intersetRate;
	}

	public void setIntersetRate(Double intersetRate) {
		this.intersetRate = intersetRate;
	}
	
	
	public void updateBalance () {
		balance += balance * intersetRate; 	
	}
	
	@Override
	public final void withdraw (double amount) {
		balance -= amount;
	}
}
