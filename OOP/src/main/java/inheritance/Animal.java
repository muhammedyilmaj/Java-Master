package inheritance;
import org.apache.log4j.Logger;

public class Animal {
    private static final Logger LOGGER = Logger.getLogger(Animal.class);

    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

    public Animal(final String name, final int brain, final int size, final int weight, final int body) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }
    public void eat(){
        LOGGER.info("Animal is eating");
    }


    public void move(int speed) {

        LOGGER.info("Animal's speed is" + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(final int brain) {
        this.brain = brain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public int getBody() {
        return body;
    }

    public void setBody(final int body) {
        this.body = body;
    }
}
