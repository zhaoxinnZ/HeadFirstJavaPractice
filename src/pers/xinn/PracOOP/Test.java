package pers.xinn.PracOOP;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        PokerCard human = new PokerCard("human");
        PokerCard robot = new PokerCard("robot");

        System.out.println(human.CardValue);
        System.out.println(human.CardNumber);
        System.out.println(human.CurrentType);

        System.out.println("=============");

        System.out.println(robot.CardValue);
        System.out.println(robot.CardNumber);
        System.out.println(robot.CurrentType);

        System.out.println("=============");

        System.out.println(human);
        System.out.println(robot);

        int[] TestList = {2,5,7,8,9,4,10,12,13,1};

        System.out.println(Arrays.toString(TestList));
        System.out.println(Arrays.toString(new BubbleSort(TestList).getList()));
        System.out.println(Arrays.toString(TestList));


    }
}
