package inheritance;

public class Dog extends Animal{
    private int eyes;
    private int tails;
    private int legs;


    public Dog(String name, int size, int weight, int eyes, int tails, int legs) {
        super(name, 1, size, weight, 1);
        this.eyes=eyes;
        this.tails=tails;
        this.legs=legs;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("dog is eating");

    }

    @Override
    public void move(int speed) {

        System.out.println("dog is moving " +speed+ "km. speed");
        super.move(speed+5);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(final int eyes) {
        this.eyes = eyes;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(final int tails) {
        this.tails = tails;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(final int legs) {
        this.legs = legs;
    }
}
