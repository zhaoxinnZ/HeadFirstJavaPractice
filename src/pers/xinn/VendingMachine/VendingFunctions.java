package pers.xinn.VendingMachine;

import java.lang.reflect.GenericArrayType;

public interface VendingFunctions {

    static void Insert(Integer i){
        switch (i){
            case 1:
                System.out.println("1 Coin inserted!");
                break;
            case 5:
                System.out.println("5 Coins inserted!");
                break;
            case 10:
                System.out.println("10 Coins inserted!");
                break;
        }


    }
}
