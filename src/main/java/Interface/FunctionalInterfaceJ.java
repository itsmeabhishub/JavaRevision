package Interface;

@FunctionalInterface
interface Devil{
    void show();
}

public class FunctionalInterfaceJ {
    public static void main(String[] args) {
        Devil dev = new Devil() {
            @Override
            public void show() {
                System.out.println("In void show");
            }
        };
        dev.show();
    }
}
