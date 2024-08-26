package Section_5.Composition.OOP_MASTER_CHALLENGE;

public class Main {
    public static void main(String[] args) {

//        Orders order = new Orders("turkey","7-up","chili");
//        order.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        order.setDrinkSize("SMALL");
//        order.printItemiedList();

        Orders meal = new Orders("deluxe","7-up","chili");
        meal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        meal.setDrinkSize("SMALL");
        meal.printItemiedList();
    }
}
