package midterm.midterm2021_2_RE;

public class SpeechHistogram {

    private int[] counts;
    private int[] groupCounts;
    private Speech speech;

    public SpeechHistogram(Speech speech) {
        this.speech = speech;
        counts = new int[26];
        groupCounts = new int[5];
    }

    public void calculateHistogram() {
        for (int i = 0; i < speech.getNumOfWords(); i++) {
            //System.out.println((int)speech.getFirstCharOfWord(i));
            counts[(int)speech.getFirstCharOfWord(i)-97]++;
        }
        for (int i = 0; i < counts.length - 1; i++) {
            groupCounts[(int) i / 5] += counts[i];
        }
    }

    public void print() {
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
