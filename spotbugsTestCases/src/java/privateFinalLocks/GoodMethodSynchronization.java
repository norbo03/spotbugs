package privateFinalLocks;

public class GoodMethodSynchronization {

//    private GoodMethodSynchronization() {}
    public synchronized void doStuff() {
        System.out.println("Do some stuff");
    }

    private GoodMethodSynchronization factory() { // this should only be fine if the constructors were private
        return new privateFinalLocks.GoodMethodSynchronization();
    }

    private static final Object lock = new Object();
    public void doOtherStuff() {
        synchronized (lock) {
            System.out.println("Do some other stuff");
        }
    }
}
