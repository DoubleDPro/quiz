public class Quiz {

    public static void main(String[] args) {
      AbstractPerson person = new Person();
      person.make();
    }
}

abstract class AbstractPerson {
    
    public AbstractPerson() {
        System.out.println("Person");
    }
    
    abstract void make();
}

class Person extends AbstractPerson {
    
    @Override
    void make() {
        System.out.println("Making something...");
    }
}
