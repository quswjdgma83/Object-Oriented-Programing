import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String randomString = "In blandit lacus ac sapien dictum, elementum fringilla sem varius. Vestibulum consectetur metus at felis porttitor, a rhoncus neque consectetur. Integer vehicula felis non metus eleifend, in blandit risus ullamcorper. Phasellus mauris nisi, facilisis et quam placerat, congue venenatis diam. Praesent in erat odio. Phasellus sit amet efficitur sem. Ut quis mi venenatis, feugiat justo eu,  rhoncus velit. Suspendisse iaculis tempus sapien. Integer mauris neque, posuere sed mi at, aliquet facilisis nibh. Cras vel blandit lorem. Aliquam suscipit, nisl id condimentum  condimentum,  purus magna maximus sem, vitae vehicula diam nisi ac enim.";
        StringHashValues SH = new StringHashValues();

        SH.StringHashValues(randomString);
        System.out.println("찾을 단어를 입력하세요");
        Scanner SC = new Scanner(System.in);
        String findWord = SC.next();

        SH.printWordWithSameHash(findWord);
    }
}
