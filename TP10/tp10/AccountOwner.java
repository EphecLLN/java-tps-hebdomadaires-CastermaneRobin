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
		Thread salaire = new Salary(compte);
		Thread card = new BankCard(compte);

		System.out.println(compte.getBalance());
		salaire.start();
		System.out.println(compte.getBalance());
		card.start();
		System.out.println(compte.getBalance());
	}

}
