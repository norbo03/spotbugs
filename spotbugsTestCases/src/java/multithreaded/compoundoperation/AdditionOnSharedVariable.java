package multithreaded.compoundoperation;

public class AdditionOnSharedVariable extends Thread {
    private int num = 0;

    public void toggle() {
        num = num + 2;
    }

    public Integer getNum() {
        return num;
    }
}
