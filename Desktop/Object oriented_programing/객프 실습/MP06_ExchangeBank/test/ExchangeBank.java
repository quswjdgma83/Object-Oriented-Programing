package test;

public class ExchangeBank {
    IExchangeRate[] rate;
    public void add(String name, double rate, String monetaryName) {
        if (count >4) {
            IExchangeRate[] newRate = new IExchangeRate[count+1];
            for(int i=0;i<count; i++) {
                newRate[i] = this.rate[i]
            }
            this.rate = newRate;
        }
        this.rate[count] = new ExchangeCurrency(name, rate, monetaryName);
        count++;
    }
}
