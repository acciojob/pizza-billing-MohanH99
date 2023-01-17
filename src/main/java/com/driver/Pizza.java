package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    //private String bill;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAwayAdded=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice=this.price;
        //System.out.println(basePizzaPrice);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += 80;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        if(basePizzaPrice==300){
            this.price += 70;
        }else {
            this.price += 120;
        }
    }

    public void addTakeaway(){
        isTakeAwayAdded=true;
        this.price += 20;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Base Price Of The Pizza:"+basePizzaPrice);

        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+"80"+"\n";
        }
        if(isExtraCheeseAdded){
            bill += "Extra Toppings Added: "+"70"+"\n";
        }
        if(isExtraCheeseAdded){
            bill += "Paperbag Added: "+"20"+"\n";
        }
        bill += "Total Price: "+this.price + "\n";
        System.out.println(bill);
        //return this.bill;
    }
}
