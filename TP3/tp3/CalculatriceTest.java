package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	void testCarreInt() {
		Calculatrice calc2 = new Calculatrice();
		assertEquals(0, calc2.carre(0));
		
	}
	@Test
	void testNbrePair() {
		Calculatrice calc2 = new Calculatrice();
		assertEquals("true", calc2.NbrePair(2));
		assertEquals("true", calc2.NbrePair(0));
		assertEquals("false", calc2.NbrePair(1));
		assertEquals("true", calc2.NbrePair(-2));
		assertEquals("false", calc2.NbrePair(-1));
	}

	@Test
	void testPerimetreCarre() {
		Calculatrice calc2 = new Calculatrice();
		assertEquals(16, calc2.perimetreCarre(4));
		assertEquals(0, calc2.perimetreCarre(0));
	}

	@Test
	void testTestCarac() {
		Calculatrice calc2 = new Calculatrice();
		assertEquals("true", calc2.testCarac('o', "bonjour"));
		assertEquals("true", calc2.testCarac('o', "oo"));
		assertEquals("false", calc2.testCarac('o', "bjjjr"));
	}

}