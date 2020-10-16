class AnimalThree {

  private String name;
  private double averageWeight;
  private int numberOfLegs;

  //getter
  public String getName() {
    return name;
  }

  public double getAverageWeight() {
    return averageWeight;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setAverageWeight(double averageWeight) {
    this.averageWeight = averageWeight;
  }

  public void setNumberOfLegs(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }
}

class TestAnimalThree {
  public static void main(String[] args) {
    AnimalThree myAnimal = new AnimalThree();

    myAnimal.setName("Eagle");
    myAnimal.setAverageWeight(1.5);
    myAnimal.setNumberOfLegs(2);

    System.out.println("Name: " + myAnimal.getName());
    System.out.println("Average Weight: " + myAnimal.getAverageWeight());
    System.out.println("Number of Legs: " + myAnimal.getNumberOfLegs());
  }
}
