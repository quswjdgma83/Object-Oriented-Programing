public class StringHashValues {
    static int count = 0;
    static String[] newWord;
    static int[] hash;
    public static int[] StringHashValues(String randomString) {
        String[] words = randomString.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                count++;
            }
        }
        //System.out.println(count);



        hash = new int[count];
        newWord = new String[count];
        int k = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                newWord[k] = words[i];
                k++;
            }
        }

        for (int i = 0; i < count; i++) {
            String word = newWord[i];
            for (int j = 0; j < word.length(); j++) {
                double nn = word.length();
                hash[i] += ((double) word.charAt(j) * Math.pow(31, nn - j - 1)) % count;
            }
            System.out.println(i + "번째 " + newWord[i] + ": " + hash[i]);
        }
        return hash;
    }

    void printWordWithSameHash(String findSame) {
        double findSameHash = 0;
        int k = 0;
        for (int i = 0; i < findSame.length(); i++) {
            double nn = findSame.length();
            findSameHash += ((double) findSame.charAt(i) * Math.pow(31, nn - i - 1)) % count;
        }

        for (int i = 0; i < count; i++) {
            if (findSameHash == hash[i]) {
                System.out.println("해시값이 일치하는 단어: " + newWord[i]);
                k++;
            }
        }
        if(k == 0) {
            System.out.println("해시값이 일치하는 단어가 없습니다.");
        }
    }
}
