package eight.interfaces;

public class Java8InterfacesExample {

  private static final Car car = new Car();

  public void run() {
    car.printWheels();
    System.out.println(UtilityInterface.add(2, 2));
  }
}
