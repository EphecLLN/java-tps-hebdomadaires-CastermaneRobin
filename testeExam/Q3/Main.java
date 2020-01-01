package Q3;

public class Main {

	public static void main(String[] args) {
		Compte monCompte = new Compte();
		
		CarteBanquaire carte1 = new CarteBanquaire(monCompte);
		CarteBanquaire carte2 = new CarteBanquaire(monCompte);
		CarteBanquaire carte3 = new CarteBanquaire(monCompte);
		CarteBanquaire carte4 = new CarteBanquaire(monCompte);
		CarteBanquaire carte5 = new CarteBanquaire(monCompte);
		CarteBanquaire carte6 = new CarteBanquaire(monCompte);
		CarteBanquaire carte7 = new CarteBanquaire(monCompte);
		CarteBanquaire carte8 = new CarteBanquaire(monCompte);
		CarteBanquaire carte9 = new CarteBanquaire(monCompte);
		CarteBanquaire carte10 = new CarteBanquaire(monCompte);
		
		carte1.run();
		carte2.run();
		carte3.run();
		carte4.run();
		carte5.run();
		carte6.run();
		carte7.run();
		carte8.run();
		carte9.run();
		carte10.run();
		
		System.out.println(monCompte.getSolde());
	}

}
