package Part1Advanced;

public class Main {
    public static void main(String[] args) {
        //Using thread
        MyThreads t1 = new MyThreads();
        t1.start();

        Thread t2 = new Thread(new MyRunable());
        t2.start();

        Thread thread1 = Thread.currentThread();
        System.out.println("Thread ID: "+thread1.getId());
        System.out.println("Thread Name: "+thread1.getName());
        System.out.println("Thread Priority: "+thread1.getPriority());
        //using synchronized
        SyncMyRunable run = new SyncMyRunable();
        Thread t1Sync = new Thread(run);
        Thread t2Sync = new Thread(run);
        t1Sync.start();
        t2Sync.start();

        //wait and notify
        final Customer c = new Customer();
        Thread th1 = new Thread(){
            public void run(){
                c.withdraw(100);
            }
        };
        th1.start();

        Thread th2 = new Thread(){
            @Override
            public void run() {
                c.deposit(1000);
            }
        };
        th2.start();
    }
}
