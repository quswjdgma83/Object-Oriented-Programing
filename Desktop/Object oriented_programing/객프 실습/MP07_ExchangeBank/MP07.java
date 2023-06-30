public class MP07 {
    public static void main(String[] args) {
//        String[] countries = { "미국", "중국", "영국", "유로", "스위스" };
//        double[] rate = { 1335.00, 192.97, 1668.42, 1473.64, 1502.70 };
//        String[] currencyNames = { "달러", "위안", "파운드", "유로", "프랑" };

        String[] countries = { "미국", "중국", "영국", "유로", "스위스", "캐나다", "홍콩" };
        double[] rate = { 1335.00, 192.97, 1668.42, 1473.64, 1502.70, 978.95, 170.06 };
        String[] currencyNames = { "달러", "위안", "파운드", "유로", "프랑", "달러", "달러" };

        ExchangeBank bank = new ExchangeBank();
        for (int i = 0; i < countries.length; i++) {
             bank.add(countries[i], rate[i], currencyNames[i]);
        }
//        bank.exchange(100000); // 10만원을 환전할 때의 금액을 나라별로 출력
        double amount = 1000;
        double amount2 = bank.exchange("미국", "중국", amount);
        System.out.printf("%.2f %s를 %s으로 환전. 환전 금액: %.2f\n",
                amount, "달러", "위안", amount2);
    }
}
