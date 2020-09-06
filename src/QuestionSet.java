import java.util.Scanner;

public abstract class QuestionSet extends Question {

    public QuestionSet(String question, String questionType, String[] choices, boolean[] answerKey) {
        super(question, questionType, choices, answerKey);
    }

    @Override
    public boolean askQuestion() {
        String[] choices = getChoices();
        int choiceId;

        Scanner input = new Scanner(System.in);

        System.out.println(getQuestionType() + ": " + getQuestion());
        for (int i = 0; i < choices.length; i++) {
            choiceId = i + 1;
            System.out.println(choiceId + ") " + choices[i]);
        }
        System.out.println("Choose answer by entering corresponding number:");
        int userChoice = input.nextInt();
        input.close();
        return getAnswerKey()[userChoice -1];
    }

}
