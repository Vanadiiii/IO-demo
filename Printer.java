public class Printer {
    public static void main(String[] args) throws InterruptedException {
        for (byte i = 0; i < 100; i++) {
            System.out.print(i);
            Thread.sleep(200);
        }
    }
}

