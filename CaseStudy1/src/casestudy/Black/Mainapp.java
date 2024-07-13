package casestudy.Black;

import java.util.Iterator;
import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args) {
		Account[] account = new Account[20];
		AccountReport[] report = new AccountReport[20];
		int Accountnumber = 1000, count = 0, rep = 0, choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("============================================================================");
			System.out.println("\t\t\t|    Enter Your Choice        |");
			System.out.println("============================================================================");
			System.out.println("\t\t\t| 1 | Login                   |");
			System.out.println("\t\t\t-------------------------------");
			System.out.println("\t\t\t| 2 | Open New Account        |");
			System.out.println("\t\t\t-------------------------------");
			System.out.println("\t\t\t| 0 | Exit                    |");
			System.out.println("============================================================================");
			choice = sc.nextInt();
			System.out.println(
					"****************************************************************************");
			System.out.println();
			switch (choice) {
				case 1: {
					int loginChoice = 0;
					while (loginChoice != 3) {

						System.out.println("\t\t\t===============================");
						System.out.println("\t\t\t|    Enter Your Choice        |");
						System.out.println("\t\t\t===============================");
						System.out.println("\t\t\t| 1 | Bank Customer Login     |");
						System.out.println("\t\t\t-------------------------------");
						System.out.println("\t\t\t| 2 | Bank Admin Login        |");
						System.out.println("\t\t\t-------------------------------");
						System.out.println("\t\t\t| 3 | Exit                    |");
						System.out.println("\t\t\t===============================");
						loginChoice = sc.nextInt();
						System.out.println("\n\n\t" + loginChoice);
						System.out.println(
								"****************************************************************************");
						System.out.println();

						switch (loginChoice) {
							case 1: {
								System.out.print("Enter the Account Number : ");
								int accountNumber = sc.nextInt();
								Account accountLogin = null;

								for (Account ref : account) {
									if (ref != null && ref.getAccountNumber() == accountNumber) {
										accountLogin = ref;

									}
									if (accountLogin != null) {
										int loginChoice1 = 0;

										while (loginChoice1 != 5) {
											System.out.println("\t\t\t===============================");
											System.out.println("\t\t\t|    Enter Your Choice        |");
											System.out.println("\t\t\t===============================");
											System.out.println("\t\t\t| 1 | Deposit                 |");
											System.out.println("\t\t\t-------------------------------");
											System.out.println("\t\t\t| 2 | Withdraw                |");
											System.out.println("\t\t\t-------------------------------");
											System.out.println("\t\t\t| 3 | Bank to Bank Transfer   |");
											System.out.println("\t\t\t-------------------------------");
											System.out.println("\t\t\t| 4 | Check Balance           |");
											System.out.println("\t\t\t-------------------------------");
											System.out.println("\t\t\t| 5 | Logout                  |");
											System.out.println("\t\t\t===============================");
											loginChoice1 = sc.nextInt();
											System.out.println(
													"****************************************************************************");
											System.out.println();
											switch (loginChoice1) {
												case 1: {
													System.out.println("Enter the Deposite Amount : ");
													double amount = sc.nextDouble();
													if (accountLogin.deposite(amount)) {
														report[count++] = new AccountReport(
																accountLogin.getAccountNumber(),
																accountLogin.getAccountHodername(), " Deposite ",
																amount);
														System.out.println(amount + ": Successfull Deposite :");
													} else
														System.out.println(": Transaction Failed :");

													break;
												}
												case 2: {
													System.out.println("Enter the Withdraw Amount : ");
													double amount = sc.nextDouble();
													if (accountLogin.withdraow(amount)) {
														report[count++] = new AccountReport(
																accountLogin.getAccountNumber(),
																accountLogin.getAccountHodername(), " Withraow ",
																amount);
														System.out.println(
																"\t\tRs." + amount + " : Successfull Withdraw :");
													} else
														System.out.println(": Transaction Failed :");
													break;
												}
												case 3: {
													System.out.println("Enter Account Number : ");
													int Number = sc.nextInt();
													System.out.println("Enter the Transfer Amount : ");
													double amount = sc.nextDouble();
													Account source = accountLogin;
													for (Account refaccount : account) {
														if (refaccount != null
																&& refaccount.getAccountNumber() == Number) {

															if (refaccount.transfer(refaccount, source, amount)) {
																System.out
																		.println("\t\tRs" + amount
																				+ ": Transfer Successfull  :");

															} else
																System.out.println("\t\t: Transaction Failed :");

															// refaccount.display();
															// System.out.println("------------");
															// source.display();
														}
													}
													break;
												}
												case 4: {
													accountLogin.display();
													//double balance = accountLogin.calRateOfAccount();
													//System.out.println("After ROT = " + balance);
													break;
												}

												default:
													System.out.println("Invalid Choice!");
													break;
											}

										}

									}
								}
								break;
							}
							case 2: {
								int adminLogin = 10;
								while (adminLogin != 0) {

									String loginId = "Admin";
									String password = "@admin";
									System.out.println("\t\t * This Window Only For Bank Employee *");
									System.out.print("Enter Your Login Id : ");
									String loginId1 = sc.nextLine();
									System.out.print("Enter Your Login Id : ");
									String password1 = sc.nextLine();
									if (loginId == loginId1 && password == password1) {
										switch (adminLogin) {
											
											case 1: {
												System.out.println("\t\t1: Show All Account Report :");
												break;
											}

											default:
												break;
										}
									

									} else {
										System.out.println("\t\t* Please Check UserId and Password *");

									}
								}
								break;
							}
							default:
								break;
						}

					}
					break;
				}
				case 2: {
					int signinChoice = 0;

					System.out.println("\t\t\t===============================");
					System.out.println("\t\t\t| Which Account are you open  |");
					System.out.println("\t\t\t===============================");
					System.out.println("\t\t\t| 1 | Saving Account          |");
					System.out.println("\t\t\t-------------------------------");
					System.out.println("\t\t\t| 2 | Salary Account          |");
					System.out.println("\t\t\t-------------------------------");
					System.out.println("\t\t\t| 3 | Current Account         |");
					System.out.println("\t\t\t-------------------------------");
					System.out.println("\t\t\t| 4 | Loan Account            |");
					System.out.println("\t\t\t===============================");
					signinChoice = sc.nextInt();
					System.out.println(
							"****************************************************************************");
					System.out.println();
				

					switch (signinChoice) {
						case 1: {

							System.out.println("*Note - Minimum 2000 required ");
							sc.nextLine();
							System.out.print("Enter the Account Holder Name : ");
							String name = sc.nextLine();
							System.out.print("\nEnter Inital Amount = ");
							double balance = sc.nextDouble();
							SavingAccount s = new SavingAccount(Accountnumber++, name, balance);
							if (s.hasMinmumBalance()) {

								account[count++] = s;
								System.out.println("-----------------------------------");
								System.out.println("Loan Account Created Successfull");
								account[count - 1].display();

								// account[count-1].display();

								report[rep++] = new AccountReport(account[count - 1].getAccountNumber(), name,
										" Saving Account Open with Inital amount ", balance);

								break;
							} else {
								System.out.println("please check terms and conditions");
							}
						}
						case 2: {
							System.out.println("*Note - Minimum 2000 required ");
							sc.nextLine();
							System.out.print("Enter the Account Holder Name : ");
							String name = sc.nextLine();
							System.out.print("\nEnter Inital Amount = ");
							double balance = sc.nextDouble();
							SalaryAccount s1 = new SalaryAccount(Accountnumber++, name, balance);

							account[count++] = s1;
							System.out.println("-----------------------------------");
							System.out.println("Loan Account Created Successfull");
							account[count - 1].display();
							// account[count-1].display();
							report[rep++] = new AccountReport(account[count - 1].getAccountNumber(), name,
									" Salary Account Open with Inital amount ", balance);

							break;

						}
						case 3: {

							sc.nextLine();
							System.out.print("Enter the Account Holder Name : ");
							String name = sc.nextLine();
							System.out.print("\nEnter Inital Amount = ");
							double balance = sc.nextDouble();
							account[count++] = new CurrentAccount(Accountnumber++, name, balance);
							System.out.println("-----------------------------------");
							System.out.println("Loan Account Created Successfull");
							account[count - 1].display();
							// account[count-1].display();
							report[rep++] = new AccountReport(account[count - 1].getAccountNumber(), name,
									" Current Account Open with Inital amount ", balance);

							break;
						}
						case 4: {

							sc.nextLine();
							System.out.print("Enter the Account Holder Name : ");
							String name = sc.nextLine();
							System.out.print("\nEnter Loan Amount = ");
							double loanAmount = sc.nextDouble();
							LoanAccount temp = new LoanAccount(Accountnumber, name, 0, loanAmount, 0);
							double totalLoanAmoun = temp.calTotalLoanAmount();
							account[count++] = new LoanAccount(Accountnumber, name, 0, loanAmount, totalLoanAmoun);
							System.out.println("Loan Account Created Successfull");
							System.out.println("-------------------------------------");

							account[count - 1].display();
							// account[count-1].display();
							report[rep++] = new AccountReport(account[count - 1].getAccountNumber(), name,
									" Loan Account Open with Loan amount ", loanAmount);

							break;
						}
						default:
							break;
					}
				}

				default:
					break;
			}

		} while (choice != 0);
	}

}
