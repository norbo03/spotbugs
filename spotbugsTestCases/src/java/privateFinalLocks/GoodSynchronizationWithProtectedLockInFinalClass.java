package privateFinalLocks;

public final class GoodSynchronizationWithProtectedLockInFinalClass {
    private Object lock1 = new Object();
    private final Object lock2 = new Object();
    private static Object lock3 = new Object();
    private volatile Object lock4 = new Object();

    public void doStuff1() {
        synchronized (lock1) {
            System.out.println("Do stuff");
        }
    }

    public void doStuff2() {
        synchronized (lock2) {
            System.out.println("Do stuff");
        }
    }

    public void doStuff3() {
        synchronized (lock3) {
            System.out.println("Do stuff");
        }
    }

    public void doStuff4() {
        synchronized (lock4) {
            System.out.println("Do stuff");
        }
    }

}
