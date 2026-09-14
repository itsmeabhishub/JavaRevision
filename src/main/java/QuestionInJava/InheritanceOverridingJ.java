package QuestionInJava;
 class Animals{
     public void sound(){
         System.out.println("Sound..");
     }
 }

 class Dogs extends Animals{
     public void sound(){
         System.out.println("Dog is making sound");
     }
 }

 class Puppy extends Animals{
     public void sound(){
         System.out.println("Puppy is making sound");
     }
 }

public class InheritanceOverridingJ {
    public static void main(String[] args) {
        Animals kuttaPar;
        kuttaPar = new Dogs();
        kuttaPar.sound();

        kuttaPar = new Puppy();
        kuttaPar.sound();
    }
}
