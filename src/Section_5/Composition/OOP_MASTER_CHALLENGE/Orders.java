package Section_5.Composition.OOP_MASTER_CHALLENGE;

import java.util.concurrent.RecursiveTask;

public class Orders {
    private Burger burger;
    private Item drink;
    private Item side;

    public Orders(){
        this("regular","coke","fries");
    }

    public Orders(String burgerType,String drinkType,String sideType){
        if(burgerType.equalsIgnoreCase("deluxe")){
           burger = new DeluxBurger(burgerType,8.5);
        }else {
            burger = new Burger(burgerType,4.0);
        }

        drink =new Item("drink",drinkType,1.00);
        side = new Item("side",sideType,1.50);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

  public void printItemiedList(){
        burger.printItem();
        if(burger instanceof DeluxBurger){
            Item.printItem(drink.getName(),0);
            Item.printItem(side.getName(),0);
        }else {
            drink.printItem();
            side.printItem();
        }
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());
  }
  public void addBurgerToppings(String extra1,String extra2,String extra3){
        burger.addToppings(extra1,extra2,extra3);
  }

    public void addBurgerToppings(String extra1,String extra2,String extra3 , String extra4,String extra5){
       if(burger instanceof DeluxBurger db){
           db.addToppings(extra1,extra2,extra3,extra4,extra5);
       }else{
           burger.addToppings(extra1,extra2,extra3);
       }


    }
  public void setDrinkSize(String size){
        drink.setSize(size);
  }
}

class Item{
    private String name;
    private String type;
    private String size = "medium";
    private double price;

    public Item(String type, String name, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName(){
        if (type.equals("SIDE") || type.equals("DRINK")){
            return size + " "+ name;
        }
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getAdjustedPrice(){
        return switch(size){
            case "SMALL" -> getPrice() - 0.5;
            case "LARGE" -> getPrice() + 1;
            default -> getPrice();
        };
    }
    public void setSize(String size){
        this.size = size;
    }
    public static void printItem(String name,double price){
        System.out.printf("%20s:%6.2f%n",name,price);
    }
    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}

class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super( "Burger",name, price);
    }

    @Override
    public double getAdjustedPrice() {
        return getPrice() + ((extra1 == null)? 0 :extra1.getAdjustedPrice())+
                ((extra2 == null)? 0: extra2.getAdjustedPrice())+
                ((extra3 == null)? 0: extra3.getAdjustedPrice());
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    public double getExtraPrice(String toppingName){

         return  switch(toppingName.toUpperCase()){
             case "AVOCADO","CHEESE" -> 1.0;
             case "BACON","HAM","SALAMI" -> 1.5;
             default -> 0.0;
         };
    }
    public void addToppings(String extra1,String extra2,String extra3){
        this.extra1 = new Item("Topping",extra1,getExtraPrice(extra1));
        this.extra2 = new Item("Topping",extra2,getExtraPrice(extra2));
        this.extra3 = new Item("Topping",extra3,getExtraPrice(extra3));
    }

    public void printItemizedList(){
        printItem("BASE BURGER",getPrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
class DeluxBurger extends  Burger {
    Item delux1;
    Item delux2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4,String extra5) {
        super.addToppings(extra1, extra2, extra3);
        delux1 = new Item("TOPPING",extra4,0);
        delux2 = new Item("TOPPING",extra5,0);
    }



    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(delux1 != null){
            delux1.printItem();
        }
        if(delux2 != null){
            delux2.printItem();
        }
    }
    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}