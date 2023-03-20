package Part1Advanced;

public class SyncMyRunable implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
          }
        }
    }
}
