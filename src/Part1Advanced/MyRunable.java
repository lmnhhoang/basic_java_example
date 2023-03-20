package Part1Advanced;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
