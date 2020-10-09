package eight.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsExample {

  private final List<String> strings = List.of("A", "B", "C", "D", "");

  public void run() {
    System.out.println(strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining("-")));
  }
}
