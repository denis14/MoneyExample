
public class Money
{

   protected int amount;

   protected String currency;


   Money times( final int multiplier )
   {
      return new Money( this.amount * multiplier, this.currency );
   }


   String currency()
   {
      return this.currency;

   }


   Money( final int amount, final String currency )
   {
      this.amount = amount;
      this.currency = currency;
   }


   static Money dollar( final int amount )
   {
      return new Money( amount, "USD" );
   }


   static Money franc( final int amount )
   {
      return new Money( amount, "CHF" );
   }


   @Override
   public boolean equals( final Object object )
   {
      final Money money = ( Money ) object;
      return this.amount == money.amount && this.currency.equals( money.currency );
   }


   @Override
   public String toString()
   {
      return this.amount + " " + this.currency;
   }

}
