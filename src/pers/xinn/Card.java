package pers.xinn;

import java.util.Random;

public class Card {

    int Number;
    String Type;
    int CardNumber;
    String Name;

    String[] CardType = {"Diamond","Club","Heart","Spade"};

    public Card(String s){
        Random random = new Random();
        int cardNumber = random.nextInt(52)+1;
        int CardTypeIndex = cardNumber/13;
        this.Name = s;
        this.Number = cardNumber;
        this.CardNumber = cardNumber%13;
        this.Type = CardType[CardTypeIndex];
    }

    public int getNumber(){
        return Number;
    }

    public int getCardNumber(){
        return CardNumber;
    }

    public String getCardType(){
        return Type;
    }


    @Override
    public String toString(){
        return String.format("The card number of %s is %2d and the type is %s",Name,CardNumber,Type);
    }
}