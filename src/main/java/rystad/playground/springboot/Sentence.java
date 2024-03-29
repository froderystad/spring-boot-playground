package rystad.playground.springboot;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity(name = "sentences")
public class Sentence {
    @Id
    private Integer id;
    private String sentence;

    Sentence(final String sentence) {
        this.id = new Random().nextInt();
        this.sentence = sentence;
    }

    Sentence() {
    }

    public String getSentence() {
        return sentence;
    }
}
