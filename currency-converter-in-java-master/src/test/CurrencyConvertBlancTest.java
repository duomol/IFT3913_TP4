import currencyConverter.Currency;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CurrencyTest {

    @Test
    public void testConvert() {
    	//On test avec trois series pour etre certain
    	double test1 = Currency.convert(10, 1.5);
    	double resultat1 = 15;
    	assertEquals(resultat1, test1, 0.001);
    	
    	double test2 = Currency.convert(8, 1.02);
    	double resultat2 = 8.16;
    	assertEquals(resultat2, test2, 0.001);
    	
    	double test3 = Currency.convert(16, 2);
    	double resultat3 = 32;
    	assertEquals(resultat3, test3, 0.001);
    	

        
    }
}