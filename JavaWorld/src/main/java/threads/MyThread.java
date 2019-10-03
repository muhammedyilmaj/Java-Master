package threads;


public class MyThread {
    public static void main(String[] args) {
        SecondThread secondThread= new SecondThread();
        secondThread.start();

        System.out.println( Color.RED + "my thread");
        System.out.println(Color.RED+ "my thread again running");

        new Thread(()-> System.out.println(Color.PURPLE+ "not has class thread")).start();

        Thread thirdThread= new Thread(new ThirdThread());
        thirdThread.start();
    }
}
