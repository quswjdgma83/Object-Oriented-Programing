package midterm.midterm2022_2RE;

import java.util.ArrayList;
import java.util.Arrays;

public class ExchangeBank {

    ExchangeRate[] rate;
    int count;

    ArrayList<ExchangeRate> exchangeRates = new ArrayList<>();

    public ExchangeBank() {
        this.rate = new ExchangeRate[5];
        count = 0;
    }

    public void add(String name, double rate, String monetaryUnit) {
        ExchangeRate addExchangeRate = new ExchangeRate();
        if (count == 5) {
            for (int i = 0; i < 5; i++) {
                exchangeRates.add(this.rate[i]);
            }
            addExchangeRate.setName(name);
            addExchangeRate.setRate(rate);
            addExchangeRate.setMonetaryUnit(monetaryUnit);
            exchangeRates.add(addExchangeRate);
            count += 1;
        } else if (count > 5) {
            addExchangeRate.setName(name);
            addExchangeRate.setRate(rate);
            addExchangeRate.setMonetaryUnit(monetaryUnit);
            exchangeRates.add(addExchangeRate);
        } else {
            this.rate[count] = addExchangeRate;
            this.rate[count].setName(name);
            this.rate[count].setRate(rate);
            this.rate[count].setMonetaryUnit(monetaryUnit);
            count++;
        }

    }

    public double exchange(String from, String to, double amount) {
        ExchangeRate exchangeRateFrom = findExchangeRate(from);
        ExchangeRate exchangeRateTo = findExchangeRate(to);

        if (exchangeRateFrom == null || exchangeRateTo == null) {
            return 0.0;
        }

        return exchangeRateFrom.getRate() / exchangeRateTo.getRate() * amount;
    }

    public ExchangeRate findExchangeRate(String name) {
        for (int i = 0; i < count; i++) {
            if (rate[i].getName().equals(name)) {
                return rate[i];
            }
        }
        return null;
    }
}
