package inheritance;
import org.apache.log4j.Logger;

public class Fish extends Animal {
private static final Logger LOGGER= Logger.getLogger(Fish.class);
    private int eyes;
    private int fins;
    private int gills;

    protected Fish(String name, int size, int weight, int eyes, int fins, int gills) {
        super(name, 1, size, weight, 1);
        this.eyes=eyes;
        this.fins=fins;
        this.gills= gills;
    }

    @Override
    protected void eat() {
        LOGGER.info("fish eat worm");
        super.eat();
    }

    protected void swim(int speed) {
        LOGGER.info("fish swim "+ speed + " m/s speed");
    }

    protected int getEyes() {
        return eyes;
    }

    protected void setEyes(final int eyes) {
        this.eyes = eyes;
    }

    protected int getFins() {
        return fins;
    }

    protected void setFins(final int fins) {
        this.fins = fins;
    }

    protected int getGills() {
        return gills;
    }

    protected void setGills(final int gills) {
        this.gills = gills;
    }
}
