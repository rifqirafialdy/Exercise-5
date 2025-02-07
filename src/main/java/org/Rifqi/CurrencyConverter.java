package org.Rifqi;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    private final HashMap<String, Double> currencyRate = new HashMap<String, Double>();
    private Scanner scanner;

    public CurrencyConverter() {
        currencyRate.put("USD_EUR", 0.92);
        currencyRate.put("EUR_USD", 1.09);
        currencyRate.put("USD_GBP", 0.79);
        currencyRate.put("GBP_USD", 1.27);
        currencyRate.put("USD_JPY", 147.65);
        currencyRate.put("JPY_USD", 0.0068);
    }


    public void convertCurrency(Scanner scanner) {

        System.out.print("Enter the Source of Currency (USD,GBP,EUR,JPY)");
        String sourceCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the Target of Currency (USD,GBP,EUR,JPY)");
        String targetCurrecny = scanner.nextLine().toUpperCase();
        System.out.print("Enter the Amount");
        double amount = scanner.nextDouble();

        String key = sourceCurrency + "_" + targetCurrecny;
        if (currencyRate.containsKey(key)) {
            double rate = currencyRate.get(key);
            double convertedAmount = amount * rate;
            System.out.println(amount + " " + sourceCurrency + " = " + convertedAmount + " " + targetCurrecny);
        } else {
            System.out.println("Exchange Rate Not Available");
        }

    }
}
