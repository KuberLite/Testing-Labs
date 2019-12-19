package utils;

public class ThreadWait {

    public static void threadWait() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
