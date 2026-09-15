package QuestionInJava;

interface Camera{
    void camera();
}
interface MusicPlayer{
    void musicPlayer();
}

class Smartphone implements Camera, MusicPlayer{
    public void camera(){
        System.out.println("camera opening");
    }

    public void musicPlayer() {
        System.out.println("music playing");
    }
}

public class MultipleInterfaceJ {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.camera();
        sp.musicPlayer();

    }
}
