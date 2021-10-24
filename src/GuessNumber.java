import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int guesslimit = 5;
        int i = 0;
        int guessgoal = 50;
        while (i <= (guesslimit - 1)) {
            int guess = sc.nextInt();
            if (guess < guessgoal) {
                System.out.println("Input number is too small");
            } else if (guess > guessgoal) {
                System.out.println("Input number is too big");
            } else {
                System.out.println("You guessed the right number");
                System.out.println("Game Over,You won!");
                break;
            }
            i++;
        };


    }

}


