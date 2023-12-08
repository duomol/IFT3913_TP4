import currencyConverter.Currency;
import currencyConverter.MainWindow;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class MainWindowConverterTest {
    @Test 
    public void testValidConversion() {
        // Test with valid conversion
        assertEquals(10.0, MainWindow.convert("EURO","USD",mainWindow.getCurrencies(),5.0, 2.0), 0.001);
    }

    @Test
    void invalidTest() {
        MainWindow conversion = new MainWindow();
        ArrayList<Currency> currencies = new ArrayList<>();
        // Ajoutez des devises à la liste currencies, par exemple :
        currencies.add(new Currency("ABC"));
        currencies.add(new Currency("DEF"));
        Assert.assertThrows(IllegalArgumentException.class,
                () -> conversion.convert("ABC", "DEF", currencies, 50));
    }
}