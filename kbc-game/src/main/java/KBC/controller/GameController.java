package KBC.controller;

import KBC.model.Question;
import KBC.service.GameEngine;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
@CrossOrigin(origins = "*")
public class GameController {

    private final GameEngine gameEngine;

    public GameController(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @GetMapping("/start")
    public List<Question> startGame() throws Exception {
        return gameEngine.fetchRandomQuestionSet();
    }
}