package inheritance;
import org.apache.log4j.Logger;

public class Animal {
    private static final Logger LOGGER = Logger.getLogger(Animal.class);

    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

    protected Animal(final String name, final int brain, final int size, final int weight, final int body) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }
    protected void eat(){
        LOGGER.info("Animal is eating");
    }


    protected void move(int speed) {

        LOGGER.info("Animal's speed is" + speed);
    }

    protected String getName() {
        return name;
    }

    protected void setName(final String name) {
        this.name = name;
    }

    protected int getBrain() {
        return brain;
    }

    protected void setBrain(final int brain) {
        this.brain = brain;
    }

    protected int getSize() {
        return size;
    }

    protected void setSize(final int size) {
        this.size = size;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(final int weight) {
        this.weight = weight;
    }

    protected int getBody() {
        return body;
    }

    protected void setBody(final int body) {
        this.body = body;
    }
}
