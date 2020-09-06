import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{

    public Checkbox(String question, String questionType, String[] choices, boolean[] answerKey, Scanner input) {
        super(question, questionType, choices, answerKey, input);
    }

    @Override
    public boolean askQuestion() {
        String[] choices = getChoices();
        boolean[] answerKey = getAnswerKey();

        int totalCorrectAnswers = 0;
        int choiceId;

        System.out.println(getQuestionType() + ": " + getQuestion());
        for (int i = 0; i < choices.length; i++) {
            choiceId = i + 1;
            if (answerKey[i] == true) {
                totalCorrectAnswers++;
            }
            System.out.println(choiceId + ") " + choices[i]);
        }
        System.out.println("Choose each correct answer. Enter \"0\" when done.");

        ArrayList<Integer> userChoices = getUserInput();
        boolean isCorrect = checkAnswers(userChoices, answerKey, totalCorrectAnswers);

        return isCorrect;
    }

    private ArrayList<Integer> getUserInput() {

        int userChoice = 0;
        ArrayList<Integer> userInput = new ArrayList<>();

        do {
            userChoice = input.nextInt();
            if (userChoice > 0) {
                userInput.add(userChoice -1);
            }
        } while (userChoice != 0);


        return userInput;
    }

    private boolean checkAnswers(ArrayList<Integer> userChoices, boolean[] answerKey, int totalCorrectAnswers) {

        int correctUserAnswers = 0;
        ArrayList<Integer> userChoicesTemp = new ArrayList<>();

        for (int i = 0; i < userChoices.size(); i++) {
            if (!userChoicesTemp.contains(userChoices.get(i))) {
                userChoicesTemp.add(userChoices.get(i));
            }
        }

        userChoices = userChoicesTemp;

        for (int i = 0; i < userChoices.size(); i++) {
            if (answerKey[userChoices.get(i)] == false) {
                return false;
            } else if (answerKey[userChoices.get(i)] == true) {
                correctUserAnswers++;
            } else {
                return false;
            }
        }

        if (totalCorrectAnswers == correctUserAnswers) {
            return true;
        } else {
            return false;
        }
    }
}
