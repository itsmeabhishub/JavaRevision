package RevisionJ;

public class JaggedArray {
    public static void main(String[] args) {

        int jagArr[][] = new int [3][];

        jagArr[0] = new int[2];
        jagArr[1] = new int[5];
        jagArr[2] = new int[3];

        for (int i = 0; i< jagArr.length; i++){
            for (int j = 0; j < jagArr[i].length; j++){
                jagArr[i][j] = (int) (Math.random() *10);
            }
        }

        for (int n[]: jagArr){
            for (int m : n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

    }
}
