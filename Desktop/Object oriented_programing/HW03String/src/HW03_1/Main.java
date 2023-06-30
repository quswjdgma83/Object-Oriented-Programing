package HW03_1;
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
        System.out.println("문자 5개를 입력해 주세요");
        String str1 = sc.nextLine();
        String[] arr1 = str1.split("");
        String[] arr2 = randomString.split("");
        System.out.println(arr1);

        int[] count = {0, 0, 0, 0, 0};

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < randomString.length(); j++) {
                if(arr1[i].equals(arr2[j])) {
                    count[i]++;
                }
            }
            System.out.printf("문자 %s: %d\n",arr1[i], count[i]);
        }

    }
}
