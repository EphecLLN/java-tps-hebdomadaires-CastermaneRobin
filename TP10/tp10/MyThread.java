package tp10;

public class MyThread extends Thread{

	private String nom;
	private Thread other;

	public MyThread(String nom) {
		super();
		this.nom = nom;
	}
	
	public void setOther(Thread other) {
		this.other = other;
	}
	
	public void run() {
		for(int i = 0; i < 10; i ++) {
			System.out.println("Nom du thread courant: " + this.nom + ", état: " + this.getState());
			System.out.println("Nom du thread courant: " + this.nom + ", Nom du thread other: " + other.getName() + ", état: " + other.getState());
		}
	}
	
	public static void main(String args[]) {
		MyThread threadA = new MyThread("threadA");
		MyThread threadB = new MyThread("threadB");
		
		threadA.setOther(threadB);
		threadB.setOther(threadA);
		System.out.println(threadA.getState());
		System.out.println(threadB.getState() + "\n");
		
		threadA.start();
		threadB.start();
		System.out.println("\n");
		
		System.out.println(threadA.getState());
		System.out.println(threadB.getState() + "\n");
		
	}
}
