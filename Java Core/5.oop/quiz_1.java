public class Quiz {

    public static void main(String[] args) {
      Son son = new Son();
      son.showInt();
    }
}

class Parent {
    private int i = 1;
    
    public Parent() {
        System.out.print(i);
    }
    
    public void showInt() {
        System.out.print(i);
    }
}

class Son extends Parent {
    private int i = 2;
    
    public Son() {
        System.out.print(i);
    }
    
    public void showInt() {
        super.showInt();
        System.out.print(i);
    }
}
