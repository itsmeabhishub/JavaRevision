package InterfaceQuestion;
interface Camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{
    public void takePhoto(){
        System.out.println("Opening camera and taking selfie");
    }

    public void playMusic(){
        System.out.println("Opening music playlist and playing the song");
    }
}

public class MultipleInterfaceJQ {
    public static void main(String[] args) {
        SmartPhone dev = new SmartPhone();
        dev.takePhoto();
        dev.playMusic();
    }
}
