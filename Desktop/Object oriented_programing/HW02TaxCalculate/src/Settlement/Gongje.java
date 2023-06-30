package Settlement;

public class Gongje {

    public double GongJe1(double totalUse, double totalIncome) {
        if (totalUse >= (totalIncome/4)) {
            return 0.15 * (totalUse - totalIncome / 4);
        }
        else  {
            return 0;
        }
    }

    public double GongJe2(double bookAndConcert, double totalIncome) {
        if (totalIncome <= 7000) {
            if (0.3*bookAndConcert <= 1000000) {
                return 0.3*bookAndConcert;
            }
            else {
                return 1000000;
            }
        }
        else {
            return 0;
        }
    }
}
