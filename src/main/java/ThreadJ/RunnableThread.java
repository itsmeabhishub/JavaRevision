package ThreadJ;

class E implements Runnable{
    public void run(){
        for (int i =0; i<5 ; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class F implements Runnable{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableThread {

    public static void main(String[] args) {
        Runnable obj5 = new E();
        Runnable obj6 = new F();

        Thread t1 = new Thread(obj5);
        Thread t2 = new Thread(obj6);

        t1.start();
        t2.start();
    }
}
