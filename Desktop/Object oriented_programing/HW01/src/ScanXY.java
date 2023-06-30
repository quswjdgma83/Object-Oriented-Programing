import java.util.Scanner;

public class ScanXY {
    double Calculate(double x1,double  y1,double x2,double y2) {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        ScanXY cal = new ScanXY();

        double x1 = Scan.nextDouble();
        double y1 = Scan.nextDouble();
        double x2 = Scan.nextDouble();
        double y2 = Scan.nextDouble();

        double output = cal.Calculate(x1,y1,x2,y2);
        System.out.println(output);
    }
}