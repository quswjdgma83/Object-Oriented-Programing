package midterm.midterm2021_2_RE;

public class Speech {

    private String[] speech;

    public Speech(String[] speech) {
        this.speech = new String[speech.length];
        for (int i = 0; i < speech.length; i++) {
            this.speech[i] = speech[i];
        }
    }

    public Character getFirstCharOfWord(int idx) {
        return ConvertChar.toLowerCase(speech[idx].charAt(0));
    }

    public int getNumOfWords() {
        return speech.length;
    }
}
