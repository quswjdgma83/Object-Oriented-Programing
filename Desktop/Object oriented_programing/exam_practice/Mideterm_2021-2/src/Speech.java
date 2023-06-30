public class Speech {
    String[] speech;

    void Speech(String[] speech) {
        this.speech = speech;
    }

    Character getFirstCharOfWord(int idx) {
        if (idx < speech.length) {
            return speech[idx].charAt(0);
        }
        return null;
    }

    int getNumOfWords() {
        return speech.length;
    }
}
