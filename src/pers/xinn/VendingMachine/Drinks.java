package pers.xinn.VendingMachine;

public enum Drinks {
    Coke("Cola",30),
    Pepsi("Pepsi",30),
    OrangeJuice("OrangeJuice",15);


    private final String drinkname;
    private final Integer drinkprice;

    Drinks(String drinkname,Integer drinkprice){
        this.drinkname = drinkname;
        this.drinkprice = drinkprice;
    }

    public Integer getPrice(){
        return drinkprice;
    }

    public String getDrinkname(){
        return drinkname;
    }

    public void getInfo(){
        System.out.println(String.format("Drink:%s ,Price:%s",drinkname,drinkprice));
    }


}
