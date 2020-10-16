class BirdParent {
  public String reproduction = "egg";
  public String outerCovering = "feather";

  public void flyUp() {
    System.out.println("Flying up...");
  }

  public void flyDown() {
    System.out.println("Flying down...");
  }
}

class EagleChild extends BirdParent {
  public String name = "eagle";
  public int lifespan = 15;
}

class TestEagle {
  public static void main(String[] args) {
    EagleChild myEagle = new EagleChild();

    System.out.println("Name: " + myEagle.name);
    System.out.println("Outer covering: " + myEagle.outerCovering);
    System.out.println("Lifespace: " + myEagle.lifespan);
    myEagle.flyUp();
    myEagle.flyDown();
  }
}
