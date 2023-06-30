package Settlement;

public class Nujin {
    public double NujinGongje(double lastIncome) {
        if (lastIncome <= 14000000) {
            return lastIncome*0.06;
        } else if (lastIncome <= 50000000) {
            return lastIncome*0.15 - 1260000;
        } else if (lastIncome <= 88000000) {
            return lastIncome*0.24 - 5760000;
        } else if (lastIncome <= 150000000) {
            return lastIncome*0.35 - 15440000;
        } else if (lastIncome <= 300000000) {
            return lastIncome*0.38 - 19940000;
        } else {
            return lastIncome*0.4 - 25940000;
        }
    }
}
