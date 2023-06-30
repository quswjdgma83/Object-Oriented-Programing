public class ExchangeRate {
    /*"double[] rate = {1438.5, 197.82, 1628.24, 1414.62, 1439.08, 1051.46, 183.26};
    String[] name = {"미국", "중국", "영국", "유로", "스위스", "캐나다", "홍콩"};
    String[] monetary = {"달러", "위안"ㅡ "파운드", "유로", "프랑", "달러", "달러"};
    */
    double rate;
    String name;
    String monetary;

    ExchangeRate(String name, double rate, String monetary) {
        this.rate = rate;
        this.name = name;
        this.monetary = monetary;
    }
}
