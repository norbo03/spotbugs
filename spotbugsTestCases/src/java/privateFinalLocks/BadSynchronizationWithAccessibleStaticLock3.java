package privateFinalLocks;

public class BadSynchronizationWithAccessibleStaticLock3 {
    static Object baseLock = new Object();
    static Object lock = new Object();

    public static void doStuff() {
        synchronized (baseLock) { // synchronizing on the package private lock object, bug should be detected here
            System.out.println("Do stuff");
        }
    }
}

class BadSynchronizationWithAccessibleStaticLockFromParent3 extends BadSynchronizationWithAccessibleStaticLock3 {
    public static void doStuff2() {
        synchronized (lock) { // synchronizing on the package private lock object, bug should be detected here
            System.out.println("Do stuff");
        }
    }
}