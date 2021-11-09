import java.util.Random;
import java.util.Scanner;


public class GuessFrom1To100 {
    public static void main(String[] args) {
        while (true) {
            //classes
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            //variables declarives
            int minimum = 1;
            int maximum = 100;
            System.out.println("Please enter a number between "+minimum+" and "+maximum);
            int guesslimit = 5;
            int limitnow = 0;
            int secretnum = random.nextInt(1+100);

            //cheat
            System.out.println(secretnum);

            while (limitnow < guesslimit){

                //variable input
                int num = scanner.nextInt();

                //make sure the number of input won't be out of range
                if (minimum < num && num < maximum){

                    if (num < secretnum){
                        System.out.println("Too small");
                        minimum = num;
                    }else if(num > secretnum){
                        System.out.println("Too big");
                        maximum = num;
                    }else {
                        System.out.println("Bingo, You won!");
                        System.out.println();
                        //limitnow is 5 now but it's out of the loop,so the description below won't be executed
                        //because of the while(limitnow < guesslimit)
                        limitnow = 5;
                    }

                    //refresh the range of the number
                    System.out.println("Please enter a number between "+minimum+" and "+maximum);

                    //counter
                    limitnow++;

                    //lose
                    if (limitnow==5){
                        System.out.println();
                        System.out.println("You lose!");
                    }
                }
                //number out of range expection
                else {
                    System.out.println("Number out of range!");
                }
            }
            System.out.println();
        }
    }
}