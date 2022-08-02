package eight.optionals;

import java.util.Optional;

public class Java8OptionalExample {

  public void run() {

    Optional.ofNullable(null).ifPresent((a) -> System.out.println("This won't print"));

    Optional.ofNullable("Value")
        .ifPresent((a) -> System.out.println(String.format("This will print %s", a)));
  }
}
