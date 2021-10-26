import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;
// Using SecureRandom because Intstream generates Integer(Int),not int,it's different,
// int is a Type;Interger is a Object

// There's a issue that the number randomly generated will lower than the Minimum

public class GuessNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Please enter the minimum number");
            int GuessMinimum = sc.nextInt();
            //get minimun int

            System.out.println("Please enter the maximum number");
            int GuessMaximum = sc.nextInt();
            //get maximum int

            SecureRandom rand = new SecureRandom();
            int GuessGoal = rand.nextInt(GuessMaximum - GuessMinimum + 1) + GuessMinimum;
            //generate a int between GuessMinimum and GuessMaximum
            //Caution:Guess Minimun have to be outside of the nextInt function

            if (GuessMinimum < GuessMaximum) {
                //make sure Minimum won't be greater than Maximum

                int i = 0;

                int GuessTimeLimit = 5;

                while (i <= (GuessTimeLimit - 1)) {
                    int guess = sc.nextInt();

                    if (guess < GuessGoal) {
                        System.out.println("Input number is too small");

                    } else if (guess > GuessGoal) {
                        System.out.println("Input number is too big");

                    } else {
                        System.out.println("You guessed the right number");
                        System.out.println("Game Over,You won!");

                        break;
                    }

                    i++;

                }
                System.out.println("The true answer is " + GuessGoal);
            }
        }
    }
}
