package threads;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("second thread running ");
    }
}
