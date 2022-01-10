package pers.xinn.VendingMachine;

public class VendingMachine implements VendingFunctions{

    Integer Coin;
    Boolean Exit;


    public VendingMachine(){
        this.Coin = 0;
    }

    void getCurrentCoin(){
        System.out.println(Coin);
    }

    void exit(){
        System.out.println("Exited!");
        Exit = true;
    }

}
