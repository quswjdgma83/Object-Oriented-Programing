public class Speech {
    String[] speech;

    Speech(String[] speech) {
        this.speech = new String[speech.length];
        for (int i = 0; i < speech.length; i++) {
            this.speech[i] = speech[i];
        }
    }

    Character getFirstCharOfWord(int idx) {
        if(idx > speech.length) {
            return null;
        }
        return speech[idx].charAt(0);
    }

    int getNumOfWords() {
        return speech.length;
    }
}
