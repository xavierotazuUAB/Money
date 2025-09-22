package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest
{
	// Atributs necessaris per tal de poder accedir als corresponents objectes des de cada mètode de prova
	Money f12CHF, f14CHF;

	@BeforeEach
	void setUp() throws Exception
	{
		// Creació objectes que utiltizarem als mètodes de prova
		f12CHF   = new Money(12,"CHF");
		f14CHF   = new Money(14,"CHF");
	}

	@Test
	void testSimpleAdd()
	{
		// Creació objectes
		Money expected = new Money(26, "CHF");
		Money result   = f12CHF.add(f14CHF);

		// Comparació valors atributs
		assertTrue(result.amount()==expected.amount());
		assertTrue(result.currency()==expected.currency());

		// Comparació directa entre objectes
		assertEquals(result, expected);
	}

	@Test
	void testConstructor()
	{
		assertTrue(f12CHF.amount()==12);
		assertEquals(f12CHF.currency(),"CHF");

	}

	@Test
	void testMoneyEquals()
	{
		Money equalMoney = new Money(12,"CHF");	// Creació objecte igual a f12CHF
		assertEquals(f12CHF, equalMoney);		// Crida implícita a equals()
		assertFalse(f12CHF.equals(f14CHF));		// Crida explícita a equals()
		assertTrue(!f12CHF.equals(null));		// Comparació amb un objecte buit
		assertEquals(f12CHF, f12CHF);			// Comparació amb si mateix
		
		assertNotEquals(f12CHF, "hola");		// Comparació amb un objecte que no és del tipus Object
	  }


}
