package midterm.midterm2022_2RE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ExchangeBank exchangeBank = new ExchangeBank();
        exchangeBank.add("미국", 1438.5, "달러");
        exchangeBank.add("중국", 197.82, "위안");
        exchangeBank.add("영국", 1628.24, "파운드");
        exchangeBank.add("유로", 1414.62, "유로");
        exchangeBank.add("스위스", 1439.08, "프랑");
        exchangeBank.add("캐나다", 1051.46, "달러");
        exchangeBank.add("홍콩", 183.26, "달러");

        Scanner sc = new Scanner(System.in);

        for (ExchangeRate exchangeRate : exchangeBank.exchangeRates) {
            System.out.println(exchangeRate.toString());
        }

        System.out.printf("환전할 통화 국가를 입력하세요: ");
        String from = sc.next();

        System.out.printf("환전 대상 통화 국가를 입력하세요: ");
        String to = sc.next();

        System.out.printf("환전 금액을 입력하세요: ");
        int amount = sc.nextInt();


        double exchange = exchangeBank.exchange(from, to, amount);
        int intExchange = (int) (exchange * 100);
        double resultExchange = (double)intExchange / 100;
        System.out.println(from + ": " + (double)amount + " " + exchangeBank.findExchangeRate(from).getMonetaryUnit() +
                " -- >" + to + ": " + resultExchange + " " + exchangeBank.findExchangeRate(to).getMonetaryUnit());
    }
}
