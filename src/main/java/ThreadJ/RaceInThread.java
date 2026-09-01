package ThreadJ;

class Increment{
    int count;
    public synchronized void add(){
        count++;
    }
}

public class RaceInThread {
    public static void main(String[] args) throws InterruptedException {

        Increment iObj = new Increment();

        Runnable obj9 = () ->{
            for (int i = 0; i<20000; i++){
                iObj.add();
            }
        };

        Runnable obj10 = () ->{
            for (int i = 0; i< 20000; i++){
                iObj.add();
            }
        };

        Thread t5 = new Thread(obj9);
        Thread t6 = new Thread(obj10);

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println(iObj.count);
    }
}
