package pers.xinn.Prac20220110;

import java.util.Random;

public class CardDemo {
    public static void main(String[] args) {

        Random random = new Random();

        String[] CardType = {"Clubs","Diamonds","Hearts","Spades"};


        int HumanCardNumber = random.nextInt(52)+1;
        int RobotCardNumber = random.nextInt(52)+1;

        System.out.println(HumanCardNumber);
        System.out.println(RobotCardNumber);

        int HumanType = HumanCardNumber / 13;
        int RobotType = RobotCardNumber / 13;

        int RealNum1 = HumanCardNumber % 13;
        int RealNum2 = RobotCardNumber % 13;
        System.out.println(CardType[HumanType]);


        System.out.println("The Human card number is: " +RealNum1 +" and the type is "+ CardType[HumanType]);
        System.out.println("The Robot card number is: " +RealNum2 +" and the type is "+ CardType[RobotType]);





    }


}
