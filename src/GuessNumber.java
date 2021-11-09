import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            //variables declaratives
            int minnum;
            int maxnum;
            int guesstimelimit = 5;
            int guessnumber;
            int i = 0;

            System.out.println("Please enter the minimum number");
            minnum = scanner.nextInt();
            //guess Minimum

            System.out.println("Please enter the maximum number");
            maxnum = scanner.nextInt();
            //guess Maximum

            if (minnum < maxnum) {
                //Make sure Minimum will never be greater than Maximum
                int Goal = random.nextInt(maxnum - minnum) + minnum;

                if (minnum < maxnum) {
                    while (i < guesstimelimit) {
                        System.out.println("Please guess your number");


                        guessnumber = scanner.nextInt();

                        if (guessnumber < Goal) {
                            System.out.println("Too small");
                        } else if (guessnumber > Goal) {
                            System.out.println("Too big");
                        } else {
                            System.out.println("Bingo");
                            break;
                        }

                        i++;
                    }
                    System.out.println("The true answer is "+Goal);
                    System.out.println();
                }
            }else {
                System.out.println("minimum number can't be greater than maximum number");
                System.out.println();
            }
        }
    }
}

