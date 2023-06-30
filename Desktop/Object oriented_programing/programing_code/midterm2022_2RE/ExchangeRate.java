package midterm.midterm2022_2RE;

public class ExchangeRate {

    private String name;
    private double rate;
    private String monetaryUnit;

    public ExchangeRate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getMonetaryUnit() {
        return monetaryUnit;
    }

    public void setMonetaryUnit(String monetaryUnit) {
        this.monetaryUnit = monetaryUnit;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", monetaryUnit='" + monetaryUnit + '\'' +
                '}';
    }
}
