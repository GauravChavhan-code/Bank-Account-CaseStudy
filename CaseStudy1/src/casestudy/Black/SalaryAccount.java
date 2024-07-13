package casestudy.Black;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SalaryAccount extends Account {
	static double rateOfinterest = 6,minimumBalance = 2000;
	LocalDate lastTranstion;

	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accountNumber, String accountHodername, double accountBalance) {
		super(accountNumber, accountHodername, accountBalance);

	}

	public static double getRateOfinterest() {
		return rateOfinterest;
	}

	public static void setRateOfinterest(double rateOfinterest) {
		SalaryAccount.rateOfinterest = rateOfinterest;
	}

	public LocalDate getLastTranstion() {
		return lastTranstion;
	}

	public void setLastTranstion(LocalDate lastTranstion) {
		this.lastTranstion = lastTranstion;
	}

	public boolean isFreezeAccount() {
		LocalDate currentDate = LocalDate.now();

		if (ChronoUnit.DAYS.between(currentDate, lastTranstion) > 60)
			return true;
		else
			return false;

	}

	public double calRateOfAccount() {
		return this.accountBalance * (rateOfinterest / 100);
	}

	@Override
	public boolean deposite(double amount) {
		lastTranstion = LocalDate.now();
		return super.deposite(amount);
	}

	@Override
	public boolean withdraow(double amount) {
		if (isFreezeAccount()) {
			System.out.println("Your Account is Freezed ");
			return false;
		} else if (amount <= this.accountBalance - minimumBalance) {
			this.accountBalance -= amount;
			this.lastTranstion = LocalDate.now();
			return true;
		}
		return false;
	}

}
