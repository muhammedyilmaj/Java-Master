package inheritance;
import org.apache.log4j.Logger;

public class Fish extends Animal {
private static final Logger LOGGER= Logger.getLogger(Fish.class);
    private int eyes;
    private int fins;
    private int gills;

    public Fish(String name, int size, int weight, int eyes, int fins, int gills) {
        super(name, 1, size, weight, 1);
        this.eyes=eyes;
        this.fins=fins;
        this.gills= gills;
    }

    @Override
    public void eat() {
        LOGGER.info("fish eat worm");
        super.eat();
    }

    public void swim(int speed) {
        LOGGER.info("fish swim "+ speed + " m/s speed");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(final int eyes) {
        this.eyes = eyes;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(final int fins) {
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(final int gills) {
        this.gills = gills;
    }
}
