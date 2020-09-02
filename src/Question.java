public abstract class Question {

    private String question;
    private String questionType;
    private String[] choices;
    private boolean[] answerKey;


    public Question(String question, String questionType, String[] choices, boolean[] answerKey) {
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
    public boolean[] getAnswerKey() {
        return answerKey;
    }

    // abstract methods
    public abstract boolean askQuestion();
}
