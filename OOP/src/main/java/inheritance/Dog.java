package inheritance;

import org.apache.log4j.Logger;

public class Dog extends Animal{
    private static final Logger LOGGER= Logger.getLogger(Dog.class);
    private int eyes;
    private int tails;
    private int legs;


    protected Dog(String name, int size, int weight, int eyes, int tails, int legs) {
        super(name, 1, size, weight, 1);
        this.eyes=eyes;
        this.tails=tails;
        this.legs=legs;
    }

    @Override
    protected void eat() {
        super.eat();
        LOGGER.info("dog is eating");

    }

    @Override
    protected void move(int speed) {

       LOGGER.info("dog is moving " +speed+ "km. speed");
        super.move(speed+5);
    }

    protected int getEyes() {
        return eyes;
    }

    protected void setEyes(final int eyes) {
        this.eyes = eyes;
    }

    protected int getTails() {
        return tails;
    }

    protected void setTails(final int tails) {
        this.tails = tails;
    }

    protected int getLegs() {
        return legs;
    }

    protected void setLegs(final int legs) {
        this.legs = legs;
    }
}
