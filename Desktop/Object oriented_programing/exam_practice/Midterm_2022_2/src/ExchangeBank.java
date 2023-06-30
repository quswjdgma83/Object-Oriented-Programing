import java.util.ArrayList;

public class ExchangeBank {
    ExchangeRate[] rate;
    int count;

    ArrayList<ExchangeRate> exchangeRates = new ArrayList<>();

    public ExchangeBank() {
        this.rate = new ExchangeRate[5];
        count = 0;
    }

    public void add(String name, double rate, String monetary) {
        //함수내용
        ExchangeRate addExchangeRate = new ExchangeRate();
    }

    double exchange(String from, String to, double amount) {
        //함수내용
        //1. 한국돈으로 일단 바꿔 = amount*from국가의 환율
        //2. 바꾼돈/to국가의 환율

    }

    ExchangeRate findExchangeRate(String name) {
        //함수내용
    }
}
