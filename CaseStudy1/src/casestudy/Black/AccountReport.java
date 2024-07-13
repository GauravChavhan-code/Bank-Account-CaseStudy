package casestudy.Black;

public class AccountReport {
	int accountNumber;
	String name;
	String activity;
	double amount;

	public AccountReport() {
		// TODO Auto-generated constructor stub
	}

	public AccountReport(int accountNumber, String name, String activity, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.activity = activity;
		this.amount = amount;
	}

	public void display() {
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println(" |      " + this.accountNumber + "      |     " + this.name + "   | " + this.activity
				+ " |     " + this.amount);
		// System.out.println("--------------------------------------------------------------------------------------------");
	}

}
