package HW03_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String randomString = "In blandit lacus ac sapien dictum, elementum fringilla sem varius. Vestibulum consectetur " +
                "metus at felis porttitor, a rhoncus neque " +
                "consectetur. Integer vehicula felis non metus eleifend, in blandit risus ullamcorper. Phasellus " +
                "mauris nisi, facilisis et quam placerat, congue" +
                "venenatis diam. Praesent in erat odio. Phasellus sit amet efficitur sem. Ut quis mi venenatis, " +
                "feugiat justo eu, rhoncus velit. Suspendisse iaculis tempus sapien. Integer mauris neque, " +
                "posuere sed mi at, aliquet facilisis nibh. Cras vel blandit lorem. Aliquam suscipit, nisl id " +
                "condimentum condimentum, purus magna maximus sem, vitae vehicula diam nisi ac enim.";
        String[] randomStringArr = randomString.split(" ");//문자열 저장

        System.out.println("문자 5개를 입력해 주세요");
        String userStr = sc.nextLine();//사용자가 입력한 문자열 저장
        String[] userArr = userStr.split("");

        for(int i = 0; i < userArr.length; i++) {
            for(int j = 0; j < randomStringArr.length; j++) {
                if(randomStringArr[j].contains(userArr[i])) {
                    System.out.println(randomStringArr[j]);
                }
            }
        }


    }
}
