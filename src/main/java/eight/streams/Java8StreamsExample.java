package eight.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamsExample {

  private final List<String> strings = List.of("A", "B", "C", "D", "");

  public void run() {
    System.out.println(strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining("-")));
    System.out.println(strings.stream().map(String::toLowerCase).collect(Collectors.joining("-")));
    System.out.println(Stream.generate(() -> "Item").limit(10).collect(Collectors.joining(", ")));
    System.out.println(
        Stream.iterate(0, n -> n + 1)
            .limit(10)
            .map(Object::toString)
            .collect(Collectors.joining(", ")));
    Stream<String> nonExecuted =
        strings.stream()
            .filter(
                s -> {
                  System.out.println("Filtering!");
                  return !s.isEmpty();
                });
    String commaSeparatedString = nonExecuted.collect(Collectors.joining(", "));
  }
}
