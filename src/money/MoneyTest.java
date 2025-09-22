package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest
{

	@Test
	void testSimpleAdd()
	{
		// [12 CHF] + [14 CHF] == [26 CHF]
		Money f12CHF   = new Money(12,”CHF”);
		Money f14CHF   = new Money(14,”CHF”);
		Money expected = new Money(26, "CHF");
		Money result   = f12CHF.add(f14CHF);

		assertTrue(result.amount()==expected.amount());
		assertTrue(result.currency()==expected.currency());

	}

	@Test
	void testConstructor()
	{
		Money f12CHF   = new Money(12,”CHF”);

		assertTrue(f12CHF.amount()==12);
		assertEquals(f12CHF.currency(),”CHF”);

	}
}
