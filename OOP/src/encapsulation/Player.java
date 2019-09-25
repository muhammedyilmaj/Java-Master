package encapsulation;

public class Player {

    private String playerName;
    private int health=100;
    private String weapon;

    public Player(String name, int health, String weapon){
        this.playerName= name;
        if(health>0 && health<100){
            this.health=health;
            System.out.println(this.health);
        }
        this.weapon=weapon;
    }

    public int getHealth(){
        return this.health;
    }

    public void loseHealth(int damage){
        this.health-=damage;
        if(this.health<0 || this.health>100){
            System.out.println("player knock down");
            this.health=0;
        }
    }
}
