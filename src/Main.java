import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors." +
                "\nWhen I say 'shoot', Choose: rock, paper, or scissors." +
                "\nAre you ready? Write 'yes' if you are");
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine();

        if (userAnswer.equals("yes") || userAnswer.equals("YES") || userAnswer.equals("Yes")) {
            System.out.println("Great!\nrock - paper - scissors, shoot!");
            String yourAns = scan.nextLine();
            String pcChoice = computerChoice(); // get the computer choice (can be done after task 3).
            // get the result (can only be done after task 4)
            System.out.println("you chose: " + yourAns + "\nComputer chose: " + pcChoice);
            if ((yourAns.equals("rock") && pcChoice.equals("paper")) ||
                    (yourAns.equals("paper") && pcChoice.equals("scissors")) ||
                    (yourAns.equals("scissors") && pcChoice.equals("rock"))
            ) {
                System.out.println("You Lose");
            } else if ((yourAns.equals("rock") && pcChoice.equals("scissors"))  ||
                    (yourAns.equals("paper") && pcChoice.equals("rock")) ||
                    (yourAns.equals("scissors") && pcChoice.equals("paper"))
            ) {
                System.out.println("You Win");
            } else
                System.out.println("Tie");
        } else {
            System.out.println("Darn, some\uFEFF other time...!");
        }
    }

    public static String computerChoice() {
        Random random = new Random();
        int rndNum = random.nextInt(3);
        if (rndNum == 1){
            return "rock";
        } else if (rndNum == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}