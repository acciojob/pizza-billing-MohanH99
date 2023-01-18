package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

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
        if(!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded) {
            isExtraToppingsAdded = true;
            if (basePizzaPrice == 300) {
                this.price += 70;
            } else {
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded) {
            isTakeAwayAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        //String bill = "";
        //System.out.println("Base Price Of The Pizza:"+basePizzaPrice);
        int toppings;
        if(isVeg){
            toppings=70;
        }else{
            toppings=120;
        }
        StringBuilder sb= new StringBuilder("");
        sb.append("Base Price Of The Pizza: "+price+"\n");

        if(isExtraCheeseAdded){
            sb.append("Extra Cheese Added: "+"80"+"\n");
        }
        if(isExtraCheeseAdded){
            sb.append("Extra Toppings Added: "+toppings+"\n");
        }
        if(isExtraCheeseAdded){
            sb.append("Paperbag Added: "+"20"+"\n");
        }
        sb.append("Total Price: "+this.price+"\n");
        bill=sb.toString();
        //System.out.println(bill);
        return this.bill;
    }
}
