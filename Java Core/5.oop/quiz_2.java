public class Quiz {

    public static void main(String[] args) {
      Sayable s = new Sayer();
      s.say();
    }
}

interface Sayable {
    
    default void say() {
        System.out.println("Say...");
    }
}

interface AnotherSayable extends Sayable {
    
    default void say() {
        System.out.println("Say another...");
    }
}

class Sayer implements AnotherSayable {
    
    @Override
    public void say() {
        System.out.println("Say something...");
    }
}
