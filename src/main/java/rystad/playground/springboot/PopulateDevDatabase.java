package rystad.playground.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Component
@Profile("dev")
public class PopulateDevDatabase {
    @Autowired
    private SentenceDAO sentenceDAO;

    @PostConstruct
    @Transactional
    public void populateDevDatabase() {
        sentenceDAO.save(new Sentence("Månen er en gul ost"));
        sentenceDAO.save(new Sentence("I mørket er alle katter grå"));

        System.out.println("Populated Dev database");
    }
}
