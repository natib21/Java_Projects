package Section_5.Composition.Encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.print("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return  health;
    }
    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
