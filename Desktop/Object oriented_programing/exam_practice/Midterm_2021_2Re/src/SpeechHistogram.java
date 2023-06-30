public class SpeechHistogram {
    int[] counts;
    int[] groupCounts;
    Speech speech;

    SpeechHistogram(Speech speech) {
        this.speech = speech;
        counts = new int[26];
        groupCounts = new int[5];
    }

    void calculateHistogram() {
        Character[] s = new Character[26];
        for(int i=0; i <26; i++) {
            s[i] = (char) (65+i);
        }
        for(int i=0; i < counts.length; i++){
            if(s[i].equals(speech.getFirstCharOfWord(i))) {
                counts[i] += 1;
            }
        }

        for(int i=0; i < 5; i++) {
            groupCounts[i/5] = counts[i];
        }
    }

    void print() {
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%c: (%d)\n", i+97, counts[i]);
        }
        for (int i = 0; i < groupCounts.length; i++) {
            System.out.printf("'%c'-'%c': (%d)", i * 5 + 97, i * 5 + 97 + 4, groupCounts[i]);

            for (int j = 0; j < groupCounts[i]; j++) {
                System.out.printf("*");
            }

            System.out.println();

        }
    }
}
