package pers.xinn;

import java.util.Random;

public class Dice {
    public int number;
    public String name;

    public Dice(String name){
        Random random = new Random();
        this.number = random.nextInt(6)+1;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s's number is %d %n",name,number);
    }
}