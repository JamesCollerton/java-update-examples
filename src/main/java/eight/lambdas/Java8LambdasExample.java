package eight.lambdas;

import java.util.function.Supplier;

public class Java8LambdasExample {

  public void run() {

    /*
     Examples of defining our own functional interfaces
    */

    MyFunctionalInterfaceNoArguments myFunctionalInterfaceNoArguments =
        () -> System.out.println("Functional interface no arguments");
    myFunctionalInterfaceNoArguments.execute();

    MyFunctionalInterfaceOneArgument myFunctionalInterfaceOneArgument = System.out::println;
    myFunctionalInterfaceOneArgument.execute("Print me");

    /*
     Examples of functional interfaces supplied by Java. There are also others including consumer, function, bifunction...
    */

    Supplier<String> stringSupplier = () -> "Here's a string";
    System.out.println(stringSupplier.get());
  }
}
