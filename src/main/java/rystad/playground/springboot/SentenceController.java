package rystad.playground.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SentenceController {
    @Autowired
    private SentenceDAO sentenceDAO;

    @RequestMapping("/sentences")
    public List<Sentence> getAllSentences() {
        return sentenceDAO.findAll();
    }
}
