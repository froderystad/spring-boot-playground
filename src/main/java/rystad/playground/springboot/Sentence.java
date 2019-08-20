package rystad.playground.springboot;

public class Sentence {
    private String sentence;

    Sentence(final String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }
}
