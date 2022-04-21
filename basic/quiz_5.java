public class Quiz {

    public static void main(String[] args) {
        
    }
    
    private static void f(int i) {
        i = 1;
        i++;
        
        System.out.println(i);
        
        if (i == 5) {
            System.out.println("Exit...");
            System.exit(0);
        }
        
        f(i);
    }
    
}
