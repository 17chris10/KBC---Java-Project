package KBC.repository;

import KBC.model.Question;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestionBank {

    private static final String URL = "jdbc:mysql://localhost:3306/kbc_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "17chris10";
    private static final String PASSWORD = "08stmary09!!";

    // List of all 4 set IDs matching the string format in your MySQL database
    private static final String[] SET_IDS = {"kbc1", "kbc2", "kbc3", "kbc4"};

    private String getRandomSetId() {
        // Uniform random pick among kbc1, kbc2, kbc3, kbc4
        int randomIndex = new Random().nextInt(SET_IDS.length);
        return SET_IDS[randomIndex];
    }

    public List<Question> loadQuestionSet() throws SQLException {
        List<Question> questions = new ArrayList<>();
        String selectedSetId = getRandomSetId();
        System.out.println(">>> RANDOM SET SELECTED BY JAVA: " + selectedSetId + " | QUESTIONS LOADED: " + questions.size());
        String sql = "SELECT * FROM questions WHERE set_id = ? ORDER BY question_number ASC";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, selectedSetId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Question q = new Question(
                        rs.getInt("question_id"),
                        rs.getString("set_id"),
                        rs.getInt("question_number"),
                        rs.getInt("prize_money"),
                        rs.getString("question_text"),
                        rs.getString("option1"),
                        rs.getString("option2"),
                        rs.getString("option3"),
                        rs.getString("option4"),
                        rs.getInt("correct_option"),
                        rs.getInt("fifty_fifty_option1"),
                        rs.getInt("fifty_fifty_option2"),
                        rs.getInt("poll_percent1"),
                        rs.getInt("poll_percent2"),
                        rs.getInt("poll_percent3"),
                        rs.getInt("poll_percent4")
                    );
                    questions.add(q);
                }
            }
        }

        // Fallback: If for any reason the randomly chosen set returned 0 questions from DB, load kbc1
        if (questions.isEmpty() && !selectedSetId.equals("kbc1")) {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, "kbc1");
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        Question q = new Question(
                            rs.getInt("question_id"),
                            rs.getString("set_id"),
                            rs.getInt("question_number"),
                            rs.getInt("prize_money"),
                            rs.getString("question_text"),
                            rs.getString("option1"),
                            rs.getString("option2"),
                            rs.getString("option3"),
                            rs.getString("option4"),
                            rs.getInt("correct_option"),
                            rs.getInt("fifty_fifty_option1"),
                            rs.getInt("fifty_fifty_option2"),
                            rs.getInt("poll_percent1"),
                            rs.getInt("poll_percent2"),
                            rs.getInt("poll_percent3"),
                            rs.getInt("poll_percent4")
                        );
                        questions.add(q);
                    }
                }
            }
        }

        return questions;
    }
}