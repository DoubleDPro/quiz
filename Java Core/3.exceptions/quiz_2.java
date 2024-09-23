import java.io.*;

public class Quiz {

    public static void main(String[] args) {
        try {
            method();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    
    }
    
    private static void method() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    
}
