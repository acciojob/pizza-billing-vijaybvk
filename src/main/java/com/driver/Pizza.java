package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean takeAwayAdded;

    private int c;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheeseAdded=false;
        this.toppingsAdded=false;
        this.takeAwayAdded=false;
        // your code goes here
        if(isVeg) this.price+=300;
        else this.price+=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded==false){
            this.price+=80;
            this.cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg && this.toppingsAdded==false){
            this.price+=70;
            this.toppingsAdded=true;
        }
        else if(isVeg==false && this.toppingsAdded==false){
            this.price+=120;
            this.toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        this.takeAwayAdded=true;
        c++;
    }

    public String getBill(){
        // your code goes here
        int bp=0, ca=0, tp=0, pp=0;
        if(isVeg) bp=300;
        else bp=400;
        if(cheeseAdded) ca=80;
        if(isVeg && toppingsAdded) tp=70;
        else if(isVeg==false && toppingsAdded) tp=120;
        if(takeAwayAdded) pp=c*20;
        if(cheeseAdded && toppingsAdded && takeAwayAdded) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Cheese Added: " + ca + "\n" +
                "Extra Toppings Added: " + tp + "\n" +
                "Paperbag Added: " + pp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded && toppingsAdded && takeAwayAdded==false) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Cheese Added: " + ca + "\n" +
                "Extra Toppings Added: " + tp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded && toppingsAdded==false && takeAwayAdded) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Cheese Added: " + ca + "\n" +
                "Paperbag Added: " + pp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded==false && toppingsAdded && takeAwayAdded) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Toppings Added: " + tp + "\n" +
                "Paperbag Added: " + pp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded && toppingsAdded==false && takeAwayAdded==false) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Cheese Added: " + ca + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded==false && toppingsAdded && takeAwayAdded==false) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Extra Toppings Added: " + tp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded==false && toppingsAdded==false && takeAwayAdded) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Paperbag Added: " + pp + "\n" +
                "Total Price: " + this.price + "\n";
        else if(cheeseAdded==false && toppingsAdded==false && takeAwayAdded==false) this.bill="Base Price Of The Pizza: " + bp + "\n" +
                "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
