package encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player= new Player("KING", 210, "Punch" );
        player.loseHealth(32);
        System.out.println(player.getHealth());
        player.loseHealth(32);
        System.out.println(player.getHealth());
        player.loseHealth(32);
        System.out.println(player.getHealth());

        player.loseHealth(2);
        System.out.println(player.getHealth());
        player.loseHealth(3);
        System.out.println(player.getHealth());

    }
}
