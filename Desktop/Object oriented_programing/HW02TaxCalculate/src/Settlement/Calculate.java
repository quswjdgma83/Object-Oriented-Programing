import Settlement.Gongje;
import Settlement.Nujin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Gongje GJ = new Gongje();
        Nujin NJ = new Nujin();
        DecimalFormat formatter = new DecimalFormat("###,###.##");

        System.out.println("이번년도 총 수입을 적어주세요: ");
        double totalIncome = Scan.nextDouble();
        System.out.println("이번년도 문화에 사용한 금액을 적어주세요: ");
        double culture = Scan.nextDouble();
        System.out.println("이번년도 신용카드 총청구액을 적어주세요: ");
        double creditCard = Scan.nextDouble();
        System.out.println("이번년도 전통시장에서 사용한 금액을 적어주세요: ");
        double traditionalMarket = Scan.nextDouble();
        System.out.println("이번년도 교통비를 적어주세요: ");
        double transportationCost = Scan.nextDouble();
        System.out.println("이번년도 도서와 공연에 사용한 금액을 적어주세요: ");
        double bookAndConcert = Scan.nextDouble();
        System.out.println("이번년도 현금영수증 금액을 적어주세요: ");
        double cash = Scan.nextDouble();

        double totalUse = creditCard + cash + traditionalMarket + bookAndConcert;
        // 사용금액 총합

        double lastIncome = totalIncome - GJ.GongJe1(totalUse, totalIncome) - GJ.GongJe2(bookAndConcert, totalIncome);
        // 세금 징수 대상 급여액

        double lastResult = NJ.NujinGongje(lastIncome);

        System.out.printf("당신이 내야할 세금은 %s원 입니다.", formatter.format(lastResult));
    }
}
