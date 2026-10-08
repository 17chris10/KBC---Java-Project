package KBC.model;

public class Question {
    private int questionId;
    private String setId;
    private int questionNumber;
    private int prizeMoney;
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int correctOption;
    private int fiftyFiftyOption1;
    private int fiftyFiftyOption2;
    private int pollPercent1;
    private int pollPercent2;
    private int pollPercent3;
    private int pollPercent4;

    public Question(int questionId, String setId, int questionNumber, int prizeMoney,
                    String questionText, String option1, String option2, String option3, String option4,
                    int correctOption, int fiftyFiftyOption1, int fiftyFiftyOption2,
                    int pollPercent1, int pollPercent2, int pollPercent3, int pollPercent4) {
        this.questionId = questionId;
        this.setId = setId;
        this.questionNumber = questionNumber;
        this.prizeMoney = prizeMoney;
        this.questionText = questionText;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctOption = correctOption;
        this.fiftyFiftyOption1 = fiftyFiftyOption1;
        this.fiftyFiftyOption2 = fiftyFiftyOption2;
        this.pollPercent1 = pollPercent1;
        this.pollPercent2 = pollPercent2;
        this.pollPercent3 = pollPercent3;
        this.pollPercent4 = pollPercent4;
    }

    public int getQuestionId() { return questionId; }
    public String getSetId() { return setId; }
    public int getQuestionNumber() { return questionNumber; }
    public int getPrizeMoney() { return prizeMoney; }
    public String getQuestionText() { return questionText; }
    public String getOption1() { return option1; }
    public String getOption2() { return option2; }
    public String getOption3() { return option3; }
    public String getOption4() { return option4; }
    public int getCorrectOption() { return correctOption; }
    public int getFiftyFiftyOption1() { return fiftyFiftyOption1; }
    public int getFiftyFiftyOption2() { return fiftyFiftyOption2; }
    public int getPollPercent1() { return pollPercent1; }
    public int getPollPercent2() { return pollPercent2; }
    public int getPollPercent3() { return pollPercent3; }
    public int getPollPercent4() { return pollPercent4; }
}