public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world! Some other change.");
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Tick Java 2");
            } catch (InterruptedException e) {
                // silent catch
            }
        }
    }
}
