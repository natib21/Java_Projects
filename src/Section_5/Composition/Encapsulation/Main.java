package Section_5.Composition.Encapsulation;

public class Main {
    public static void main(String[] args) {
//     Player player = new Player();
//
//     player.name = "Nati";
//     player.health = 20;
//     player.weapon = "sword";
//
//     int damage = 10;
//
//      player.loseHealth(damage);
//      System.out.println("Remaining health = "+player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = "+player.healthRemaining());

        EnhancedPlayer ep = new EnhancedPlayer("Nati ");

        System.out.print("Intial health is "+ ep.healthRemaining());
    }
}
