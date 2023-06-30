public class ExchangeCurrency implements IExchangeRate {
    private String country;
    double rate;
    String name;

    public ExchangeCurrency(String country, double rate, String monetaryName) {
        this.country = country;
        this.rate = rate;
        this.name = monetaryName;
    }
    @Override
    public double exchange(double won) {
        return won / rate;
    }

    @Override
    public String getName() {
        return country;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public String getMonetaryName() {
        return name;
    }
}