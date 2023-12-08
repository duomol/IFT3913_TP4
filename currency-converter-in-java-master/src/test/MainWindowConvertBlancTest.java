import currencyConverter.MainWindow;
import currencyConverter.Currency;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainWindowConvertBlancTest {

    @Test
    public void testConvert() {
    	
    	Double amount = 100.0;
    	
        // cas normal
        String currency10 = "USD";
        String currency20 = "JPY";
        ArrayList<Currency> currencies0 = Currency.init();

     // cas où currency2 n’est pas dans currencies
        String currency11 = "USD";
        String currency21 = "CAD";
        ArrayList<Currency> currencies1 = Currency.init();
        
     // cas où currency1 n’est pas dans currencies
        String currency12 = "CAD";
        String currency22 = "USD";
        ArrayList<Currency> currencies2 = Currency.init();

     // cas où currency1 et currency2 ne sont pas dans currencies
        String currency13 = "CAD";
        String currency23 = "CAD";
        ArrayList<Currency> currencies3 = Currency.init();
        
     // cas où currencies est vide
        String currency14 = "USD";
        String currency24 = "JPY";
        ArrayList<Currency> currencies4 = new ArrayList<Currency>();
        
     // cas où currencies contient 1 element
        String currency15 = "USD";
        String currency25 = "JPY";
        ArrayList<Currency> currencies5 = new ArrayList<Currency>();
        currencies5.add( new Currency("US Dollar", "USD") );
        
     // cas où currencies contient 2 elements
        String currency16 = "USD";
        String currency26 = "JPY";
        ArrayList<Currency> currencies6 = new ArrayList<Currency>();
        currencies5.add( new Currency("US Dollar", "USD") );
        currencies5.add( new Currency("Japanese Yen", "JPY") );
        

        // test
        assertEquals(0.8, MainWindow.convert(currency10, currency20, currencies0, amount), 0.001);
        assertTrue(MainWindow.convert(currency11, currency21, currencies1, amount) == 0.0);
        assertTrue(MainWindow.convert(currency12, currency22, currencies2, amount) == 0.0);
        assertTrue(MainWindow.convert(currency13, currency23, currencies3, amount) == 0.0);
        assertTrue(MainWindow.convert(currency14, currency24, currencies4, amount) == 0.0);
        assertTrue(MainWindow.convert(currency15, currency25, currencies5, amount) == 0.0);
        assertTrue(MainWindow.convert(currency16, currency26, currencies6, amount) == 0.0);
        
    }
}