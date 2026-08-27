package ExceptionJava;

import java.sql.Array;

public class MultipleException {
    public static void main(String[] args) {
        int x = 2;
        int y= 0;

        String str = null;

        int nums[] = new int[5];

        try {

            y = 18/x;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());

        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter in limit");
        }catch (NullPointerException e){
            System.out.println("Please enter string to find the length of string");
        }catch (Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println(y);
    }
}
