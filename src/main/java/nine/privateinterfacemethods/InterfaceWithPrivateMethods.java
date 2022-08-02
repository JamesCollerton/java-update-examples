package nine.privateinterfacemethods;

public interface InterfaceWithPrivateMethods {
  default void printInt(int x) {
    print(Integer.toString(x));
  }

  default void printString(String s) {
    print(s);
  }

  private void print(String s) {
    System.out.println(s);
  }
}
