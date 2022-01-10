package pers.xinn.PracOOP;

import java.util.Arrays;
import java.util.Random;

public class PokerCard {
    String name;

    //The actual number of the card(1~52)
    int CardValue;

    //The presented number of the card(1~13)
    int CardNumber;

    String[] CardTypes = {"Clubs","Diamonds","Hearts","Spades"};
    //Card Type
    String CurrentType;

    public PokerCard(String name){
        this.name = name;
        int num = new Random().nextInt(52)+1;
        this.CardValue = num;

        int Carrier = (num - 1) /13;
        this.CurrentType = CardTypes[Carrier];

        int ShiftedNum = (num - 1) % 13;
        this.CardNumber = ShiftedNum + 1;

        /*
        Explanation why doing (num - 1)
        Assume we got a number that was 13/26/39/52,the value of (num % 13) will be 0 since the card number 0 doesn't exists,
        so we came up with the solution by shifting all the numbers left foward by (num - 1)
        thus we made this number are able to be calculate properly
        and at the last part we add this number back bt doing +1 ,so the value will be the original value
         */
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getCardValue() {
        return CardValue;
    }

    public String getCurrentType() {
        return CurrentType;
    }

    public void setCardNumber(int cardNumber) {
        if (1 <= cardNumber && cardNumber <= 13){
            CardNumber = cardNumber;
        }else {
            System.out.println("Number out of range! Please enter numbers between 1 and 13");
        }
    }


    public void setCardValue(int cardValue) {
        if (1 <= cardValue && cardValue <= 52){
            CardValue = cardValue;
        }else {
            System.out.println("Value out of range! Please enter numbers between 1 and 52");
        }
    }

    public void setCurrentType(String currentType) {
        if (Arrays.stream(CardTypes).anyMatch(currentType::equals)){
            CurrentType = currentType;
        }else {
            System.out.println("Didn't found such a type! Please enter Types Like Clubs,Diamonds,Hearts,Spades");
        }

    }

    @Override
    public String toString(){
        String dashes = "##########";
        return String.format(dashes +"\nName:%s \nValue:%d \nNumber:%d \nType:%s",name,CardValue,CardNumber,CurrentType);
    }
}
