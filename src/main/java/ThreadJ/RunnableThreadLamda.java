package ThreadJ;

public class RunnableThreadLamda {
    public static void main(String[] args) {
        Runnable obj7 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };


        Runnable obj8 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread t3 = new Thread(obj7);
        Thread t4 = new Thread(obj8);

        t3.start();
        t4.start();
    }
}

