public abstract class Question {

    private String question;
    private String questionType;
    private String[] choices;
    private int[] answerKey;


    public Question(String question, String questionType, String[] choices, int[] answerKey) {
        this.question = question;
        this.questionType = questionType;
        this.choices = choices;
        this.answerKey = answerKey;
    }

    // getters
    public String getQuestion() {
        return this.question;
    }
    public String getQuestionType() {
        return this.questionType;
    }
    public String[] getChoices() {
        return this.choices;
    }
    public int[] getAnswerKey() {
        return answerKey;
    }

    // abstract methods
    public abstract void printQuestionPrompt();
    public abstract int[] getUserChoice();
    public abstract boolean checkAnswer();

}
