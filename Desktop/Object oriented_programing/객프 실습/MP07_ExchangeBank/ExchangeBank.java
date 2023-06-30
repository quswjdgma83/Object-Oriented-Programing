import java.util.ArrayList;

Arr
public class ExchangeBank {
    ArrayList<IExchangeRate> rate;
    int count;

    public ExchangeBank() {
        count = 0;
        rate = new ArrayList<IExchangeRate>();
    }

    public void add(String name, double rate, String monetaryName){
        this.rate.add(new ExchangeCurrency(name, rate, monetaryName));
    }

    public void add(IExchangeRate rate){
        this.rate.add(rate);
    }

    public double exchange(String country1, String country2, double amount) {
        IExchangeRate c1 = findCountry(country1);
        IExchangeRate c2 = findCountry(country2);
        if (c1 == null) {
            System.out.println(country1 + "환율 정보가 없습니다");
        }
        else if (c2 == null) {
            System.out.println(country2 + "환율 정보가 없습니다");
        }
        else {
            double won = c1.getRate() * amount;
            return won / c2.getRate();
        }
        return 0.0;
    }

    private IExchangeRate findCountry(String name) {
        for (IExchangeRate r : rate) {
            if (r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }
}
