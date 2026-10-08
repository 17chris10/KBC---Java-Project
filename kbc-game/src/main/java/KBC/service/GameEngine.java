package KBC.service;

import KBC.model.Question;
import KBC.repository.QuestionBank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameEngine {
    private final QuestionBank questionBank;

    public GameEngine(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    public List<Question> fetchRandomQuestionSet() throws Exception {
        return questionBank.loadQuestionSet();
    }
}