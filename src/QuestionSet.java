public abstract class QuestionSet extends Question {

    public QuestionSet(String question, String questionType, String[] choices, boolean[] answerKey) {
        super(question, questionType, choices, answerKey);
    }

    // abstract methods
    public abstract boolean checkAnswer();

}
