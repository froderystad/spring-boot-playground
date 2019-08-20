package rystad.playground.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("dev")
class SentenceDAOTest {
    @Autowired
    private SentenceDAO sentenceDAO;

    @Test
    void can_insert_sentences() {
        assertThat(sentenceDAO.count()).isZero();

        final String text = "I'm a sentence";
        sentenceDAO.save(new Sentence(text));
        sentenceDAO.flush();

        List<Sentence> sentences = sentenceDAO.findAll();
        assertThat(sentences).hasSize(1);
        assertThat(sentences.get(0).getSentence()).isEqualTo(text);
    }
}