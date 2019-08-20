package rystad.playground.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {
    @RequestMapping("/sentences")
    public Sentence[] getAllSentences() {
        return new Sentence[]{
                new Sentence("Hello world"),
                new Sentence("Foo Bar")
        };
    }
}
