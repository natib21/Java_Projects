package Section_5.Composition.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name){
        this(name, 100,"sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health <= 0){
            this.health = 1;
        }else if(health > 100){
            this.health = 100;
        }else{
            this.health = health;
        }

        this.weapon = weapon;
    }

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
