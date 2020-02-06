package homework;

public class Triple<T> {
    private T first;
    private T second;
    private T third;

    public Triple(final T first, final T second, final T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    @Override
    public String toString() {
        return "Triple{" +
            "first=" + first +
            ", second=" + second +
            ", third=" + third +
            '}';
    }
    public void rotateRight() {
        T flag= getThird();
        T value= getFirst();
        setFirst(flag);
        flag=getSecond();
        setThird(flag);
        setSecond(value);
    }
    public T getFirst() {
        return first;
    }
    public void setFirst(final T first) {
        this.first = first;
    }
    public T getSecond() {
        return second;
    }
    public void setSecond(final T second) {
        this.second = second;
    }
    public T getThird() {
        return third;
    }
    public void setThird(final T third) {
        this.third = third;
    }
}