
import currencyConverter.Currency;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
class CurrencyConterterTest{
    @Test 
    public void testValidConversion() {
        // Test with valid conversion
        assertEquals(10.0, Currency.convert(5.0, 2.0), 0.001);
    }

     @Test 
    public void testAmountBelowRange() {
        // Test with amount below the range
        try {
            Currency.convert(-5.0, 2.0);
            fail("Une exception aurait dû être levée pour un montant en dehors de la plage.");
        } catch (IllegalArgumentException e) {
            // C'est ce qu'on attendait
        }
    }

   @Test 
    public void testAmountAboveRange() {
        // Test with amount above the range
        try {
            Currency.convert(5000000.0, 2.0);
            fail("Une exception aurait dû être levée pour un montant en dehors de la plage.");
        } catch (IllegalArgumentException e) {
            // C'est ce qu'on attendait
        }
    }

    @Test 
    public void testFrontierMinRange() {
        double conversion4 = Currency.convert(0.0,2.0);
        
        // Test valid amount
        assertEquals(0.0, conversion4,0.001);
    }

    @Test 
    public void testFrontierMaxRange() {
        double conversion5 = Currency.convert(1000000.0,2.0);
        
        // Test valid amount
        assertEquals(2000000.0, conversion5,0.001);
    }

    @Test 
    public void testFrontierInfRange() {
        
        try {
            Currency.convert(-1.0, 2.0);
            fail("Une exception aurait dû être levée pour un montant en dehors de la plage.");
        } catch (IllegalArgumentException e) {
            // C'est ce qu'on attendait
        }
    }

    @Test 
    public void testFrontierSupRange() {
        
        try {
            Currency.convert(1000001.0, 2.0);
            fail("Une exception aurait dû être levée pour un montant en dehors de la plage.");
        } catch (IllegalArgumentException e) {
            // C'est ce qu'on attendait
        }
    }
}