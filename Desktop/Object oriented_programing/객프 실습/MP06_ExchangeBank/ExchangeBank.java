public class ExchangeBank {
    IExchangeRate[] rate;
    int count;

    public ExchangeBank() {
        count = 0;
        rate = new IExchangeRate[5];
    }

    public void add(String name, double rate, String monetaryName){
        if (count > 4) {
            IExchangeRate[] newRate = new IExchangeRate[count + 1];
            for (int i = 0; i < count; i++) {
                newRate[i] = this.rate[i];
            }
            this.rate = newRate;
        }
        this.rate[count] = new ExchangeCurrency(name, rate, monetaryName);
        count++;
    }

    public void exchange(double amount) {
        for (IExchangeRate er : rate) {
            System.out.printf("국가: %s, 환율: %.2f, 통화: %s, 환전 금액: %.2f\n",
                    er.getName(), er.getRate(), er.getMonetaryName(),
                    er.exchange(amount));
        }
    }
}
