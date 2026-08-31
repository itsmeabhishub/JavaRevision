package ThreadJ;

class C extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class D extends Thread{
    public void run(){
        for (int i =0; i< 100; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}

public class PriorityThread {
    public static void main(String[] args) {

        C obj3 = new C();
        D obj4 = new D();

        obj3.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj4.start();

    }
}
