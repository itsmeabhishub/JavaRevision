package RevisionJ;

class Addition{

    public int add(int i, int j){
        return i+j;
    }
}

public class AddingRevision {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        int k = addObj.add(5,6);
        System.out.println(k);
    }

}
