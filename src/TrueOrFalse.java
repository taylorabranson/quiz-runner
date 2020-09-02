import java.util.Scanner;

public abstract class TrueOrFalse extends Question {

    public TrueOrFalse(String question, String questionType, String[] choices, boolean[] answerKey) {
        super(question, questionType, choices, answerKey);
    }

    @Override
    public boolean askQuestion() {
        String[] choices = getChoices();
        int choiceId;

        Scanner input = new Scanner(System.in);

        System.out.println(getQuestionType() + "\n" + getQuestion());
        for (int i = 0; i < choices.length; i++) {
            choiceId = i + 1;
            System.out.println(choiceId + ") " + choices[i]);
        }
        System.out.println("Choose true/false by entering \"1\" or \"2\":");
        int userChoice = input.nextInt();
        return getAnswerKey()[userChoice -1];
    }
}
