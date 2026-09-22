package ExceptionHandlingQuestionJ;

class Login{
    private String username;
     private String password;
     public void  setUsername(String username){
         this.username = username;
     }
     public void setPassword(String password){
         this.password = password;
     }
     public void login(){
         if(username == null || username.isEmpty()){
             throw new IllegalArgumentException("Username cannot be null");
         }
         if(password == null || password.isEmpty()){
             throw new IllegalArgumentException("Password cannot be empty");
         }
         System.out.println("Login successfully");
     }
}
public class LoginSystemJQ {
    public static void main(String[] args) {
        Login user = new Login();
        user.setPassword("Abhi");
        user.setUsername("Abhi");
        try {
            user.login();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
