package Section_5.Composition.OOP_MASTER_CHALLENGE;

public class Main {
    public static void main(String[] args) {
//      Orders meal = new Orders();
//        System.out.printf(meal.toString());

//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        Orders regularMeal = new Orders();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemiedList();
        Orders order = new Orders("turkey","7-up","chili");
        order.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        order.setDrinkSize("SMALL");
        order.printItemiedList();
    }
}
