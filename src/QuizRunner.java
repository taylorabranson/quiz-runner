import java.util.Scanner;

public class QuizRunner {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int correctAnswers = 0;

        String[] bestColorChoices = {"blue", "green", "red", "yellow"};
        boolean[] bestColorKey = {true, false, false, false};

        MultipleChoice bestColor = new MultipleChoice("What is the best color", "Multiple Choice", bestColorChoices, bestColorKey, input);

        if (bestColor.askQuestion()) {
            correctAnswers += 1;
        }


        String[] spaceColdChoices = {"True", "False"};
        boolean[] spaceColdKey = {true, false};

        TrueOrFalse isSpaceCold = new TrueOrFalse("Space is cold.", "True or False", spaceColdChoices, spaceColdKey, input);

        if (isSpaceCold.askQuestion() == true) {
            correctAnswers += 1;
        }




        String[] goodPizzaChoices = {"pepperoni", "mushroom", "cheese", "pineapple"};
        boolean[] goodPizzaKey = {true, false, false, true};

        Checkbox goodPizza = new Checkbox("Best Pizza?", "CheckBox", goodPizzaChoices, goodPizzaKey, input);

        if (goodPizza.askQuestion()) {
            correctAnswers += 1;
        }

        System.out.println("Correct Answers: " + correctAnswers);

        input.close();
    }
}
