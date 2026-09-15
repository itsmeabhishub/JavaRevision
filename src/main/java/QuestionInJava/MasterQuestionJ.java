package QuestionInJava;

class Books{
    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void showBook(String bookName1){
        if(bookName.equals(bookName1)){
            System.out.println("Available");
        } else{
            System.out.println("Not Available");
        }
    }
}

class StudentLib extends Books{
    private int rollNo;
    private String  name;
    private String issuedBook;



    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setIssuedBook(String issuedBook) {
        this.issuedBook = issuedBook;
    }

    public String getIssuedBook() {
        return issuedBook;
    }
}

class Library extends StudentLib{


    public void booksIssue(String issueBook){
        if (getBookName().equals(issueBook)){
            setIssuedBook(issueBook);
            setBookName("");
        }else {
            System.out.println("Books Not avaiable");
        }
    }

    public void returnBook(String name){
        if(getName().equals(name)){
            setBookName(getBookName());
            setIssuedBook("");
            System.out.println("Return complete");
        } else{
            System.out.println("No book issue to him");
        }
    }
}

public class MasterQuestionJ {
    public static void main(String[] args) {

        Library libt = new Library();
        libt.setBookName("Amity");
        System.out.println(libt.getBookName());
        libt.booksIssue("Amity");
        String x = libt.getIssuedBook();
        libt.setName("Abhi");
        libt.setRollNo(12);
        System.out.println(x);
        libt.returnBook("Abhi");

    }
}
