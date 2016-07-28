import org.junit.Assert;
import org.junit.Test;

public class MultiCurrencyMoneytest
{

   @Test
   public void testDollarMultiplication()
   {
      final Money five = Money.dollar( 5 );
      Assert.assertEquals( Money.dollar( 10 ), five.times( 2 ) );
      Assert.assertEquals( Money.dollar( 15 ), five.times( 3 ) );
   }


   @Test
   public void testFrancMultiplication()
   {
      final Money five = Money.franc( 5 );
      Assert.assertEquals( Money.franc( 10 ), five.times( 2 ) );
      Assert.assertEquals( Money.franc( 15 ), five.times( 3 ) );
   }


   @Test
   public void testEquality()
   {
      Assert.assertTrue( Money.dollar( 5 ).equals( Money.dollar( 5 ) ) );
      // Assert.assertTrue(Money.dollar(5).equals(Money.dollar(6)));
      // Assert.assertTrue(Money.franc(5).equals(Money.dollar(5)));
   }


   @Test
   public void testCurrency()
   {
      Assert.assertEquals( "USD", Money.dollar( 1 ).currency() );
      Assert.assertEquals( "CHF", Money.franc( 1 ).currency() );
   }

}
