package q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPersonne {

	@Test
	void test() {
		Personne p1 = new Personne("Castermane", "Robin", "27/02/1999");
		Personne p2 = new Personne("Castermane", "Robin", "27/02/1999");
		assertEquals(0, p1.compareTo(p2));
		
		p2.setPrenom("Florent");
		boolean test1 = false;
		if(p1.compareTo(p2) > 0) {
			test1 = true;
		}
		assertEquals(true, test1);
		
		p2.setNom("Zinnen");
		boolean test2 = false;
		if(p1.compareTo(p2) < 0) {
			test2 = true;
		}
		assertEquals(true, test2);
	}

}
