package rystad.playground.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class SentenceDAOTest {
    @Autowired
    private SentenceDAO sentenceDAO;

    @Test
    void sentences_is_not_empty() {
        List<Sentence> sentences = sentenceDAO.findAll();
        assertThat(sentences).isNotEmpty();
    }
}