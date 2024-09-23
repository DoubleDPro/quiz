public class Quiz {

    public static void main(String[] args) {
        
      String firstHello = "Hello";
      String secondHello = "Hello";
      String thirdHello = new String("Hello");
      
      System.out.println(firstHello == secondHello);
      System.out.println(secondHello == thirdHello);
      System.out.println(firstHello == thirdHello);
      
      System.out.println(firstHello.equals(secondHello));
      System.out.println(secondHello.equals(thirdHello));
      System.out.println(firstHello.equals(thirdHello));
      
    }
}
