package eight;

import eight.lambdas.Java8LambdasExample;
import eight.optionals.Java8OptionalExample;
import eight.streams.Java8StreamsExample;

public class Java8Features {

  //    Optional class,
  //    default and static methods in Interfaces
  //    Method references
  //    Java Stream API for Bulk Data Operations on Collections
  //    Java Date Time API

  private final Java8LambdasExample java8LambdasExample = new Java8LambdasExample();
  private final Java8StreamsExample java8StreamsExample = new Java8StreamsExample();
  private final Java8OptionalExample java8OptionalExample = new Java8OptionalExample();

  public void run() {
    java8LambdasExample.run();
    java8StreamsExample.run();
    java8OptionalExample.run();
  }
}
