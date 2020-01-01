package Q3;

public class CarteBanquaire extends Thread{

	private Compte compte;
	
	public CarteBanquaire(Compte compte) {
		this.compte = compte;
	}
	
	public void run() {
		int argentRetire = 0;
		boolean succesRetrait;
		
		for(int i = 0; i < 10; i ++) {
			succesRetrait = compte.retrait(10);
			if(succesRetrait) {
				argentRetire += 10;
			}else {
				Thread.currentThread().interrupt();
				System.out.println("Montant retiré avec succès: " + argentRetire);
				break;
			}
			try {
				Thread.currentThread().sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println("Montant retiré avec succès: " + argentRetire);
	}
}
