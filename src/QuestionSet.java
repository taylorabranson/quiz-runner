import java.util.Scanner;

public abstract class QuestionSet extends Question {

    public QuestionSet(String question, String questionType, String[] choices, boolean[] answerKey, Scanner input) {
        super(question, questionType, choices, answerKey, input);
    }

    @Override
    public boolean askQuestion() {
        String[] choices = getChoices();
        int choiceId;
        int userChoice;


        System.out.println(getQuestionType() + ": " + getQuestion());
        for (int i = 0; i < choices.length; i++) {
            choiceId = i + 1;
            System.out.println(choiceId + ") " + choices[i]);
        }
        System.out.println("Choose answer by entering corresponding number:");
        userChoice = input.nextInt();
        return getAnswerKey()[userChoice -1];
    }

}
