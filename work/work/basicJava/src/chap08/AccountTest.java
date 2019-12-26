package chap08;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		/*account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);*/
		//account.print();
			try {
			account.deposit(-10);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				account.withdraw(60000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("¿Ã¿⁄: " + account.calculateInterest());
	}
}
