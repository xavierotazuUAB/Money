package money;

public class Money
{
	   private int iAmount;
	   private String sCurrency;

	   public int amount() {return iAmount;}
	   public String currency() {return sCurrency;}

	   public Money(int amount, String currency)
	   {
		   iAmount = amount;
		   sCurrency = currency;
	   }

	   public boolean equals(Object anObject)
	   {
	      if (anObject instanceof Money)
	      {
		      Money aMoney = (Money)anObject;
		      return (aMoney.currency().equals(currency())) &&
	                  (amount() == aMoney.amount());
	      }
	      return false;
	   }
}
