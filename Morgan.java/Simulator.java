class Simulator{
  public static void main(String[] args){
    FinalClass fc = new FinalClass();

    fc.classA = new ClassA();
    fc.classA.greeting = "New Greeting";
  }
}

public final class FinalClass {
  protected final String type = "Type-A";
  protected final ClassA classA = new ClassA();

  public final void someMethod(){
    System.out.println("Some method");
  }
}

public class ClassA extends FinalClass{

  public String greeting = "hello";

  public final void someMethod(){
    System.out.println("Some method.");
  }
}

public final class ClassB extends ClassA{

}
