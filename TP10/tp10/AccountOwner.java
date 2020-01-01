/**
 * 
 */
package tp10;

/**
 * @author HE201674
 *
 */
public class AccountOwner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount compte = new BankAccount(5000);
		Salary aug = new Salary(compte);
		BankCard dim = new BankCard(compte);
		
		aug.start();
		dim.start();
		System.out.println(compte.getBalance());
		
		/*
		double moyenne = 0;
		for(int i = 0; i < 100; i++) {
			aug.run();
			dim.run();
			moyenne += compte.getBalance();
		}
		System.out.println(moyenne/100);
		*/
	}

}
