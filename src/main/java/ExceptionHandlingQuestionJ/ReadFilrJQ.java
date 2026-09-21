package ExceptionHandlingQuestionJ;

import java.io.FileReader;
import java.io.IOException;

public class ReadFilrJQ {
    static void readFile() throws IOException {
        try( FileReader reader = new FileReader("data.txt");) {
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.println((char) ch);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        readFile();
    }
}
