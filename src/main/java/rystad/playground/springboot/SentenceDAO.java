package rystad.playground.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

interface SentenceDAO extends JpaRepository<Sentence, Integer> {
}
