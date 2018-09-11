import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by wrcron1 on 10/09/2018.
 */
public class Start {
    public static void main(String args[]) {
        YahooFinance finance = new YahooFinance();
        Stock stock = null;
        try {
            stock = YahooFinance.get("Ma");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BigDecimal price = stock.getQuote().getPrice();
        System.out.print(price);
    }
}
