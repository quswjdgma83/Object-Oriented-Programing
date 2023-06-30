public interface IExchangeRate {
    double exchange(double won);
    String getName();
    double getRate();
    String getMonetaryName();
}
