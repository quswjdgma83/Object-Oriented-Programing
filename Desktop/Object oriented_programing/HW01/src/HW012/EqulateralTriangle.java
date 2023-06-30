package HW012;
import java.util.Scanner;

public class EqulateralTriangle {
    public static void main(String[] args) {
        GetArea Area = new GetArea();
        GetDistance Distance = new GetDistance();
        Scanner Scan = new Scanner(System.in);

        double x1 = Scan.nextDouble();
        double y1 = Scan.nextDouble();
        double x2 = Scan.nextDouble();
        double y2 = Scan.nextDouble();

        double result1 = Area.Area(x1,y1,x2,y2);
        double result2 = Distance.Calculate(x1,y1,x2,y2);

        System.out.println("이등변 삼각형의 면적: " + result1);
        System.out.println("두 점 사이의 거리: " + result2);

    }
}
