package eight.interfaces;

interface Vehicle {

  int getNumberWheels();

  default void printWheels() {
    System.out.println(getNumberWheels());
  }
}
