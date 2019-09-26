package encapsulation;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Player player= new Player("KING", 210, "Punch" );
        player.loseHealth(32);
        LOGGER.info(player.getHealth());
        player.loseHealth(32);
        LOGGER.info(player.getHealth());
        player.loseHealth(32);
        LOGGER.info(player.getHealth());

        player.loseHealth(2);
        LOGGER.info(player.getHealth());
        player.loseHealth(3);
        LOGGER.info(player.getHealth());

    }
}
