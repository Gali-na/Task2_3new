public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("doWork Track");
    }

    @Override
    public void stopWork() {
        System.out.println("stopWork Track");
    }
}
