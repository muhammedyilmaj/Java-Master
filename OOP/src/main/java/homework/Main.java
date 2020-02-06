package homework;

public class Main {
    public static void main(String[] args) {
        Triple triple= new Triple("Bob","Tom","Dan");
        System.out.println(triple.toString());
        triple.rotateRight();
        System.out.println(triple.toString());

    }
}
