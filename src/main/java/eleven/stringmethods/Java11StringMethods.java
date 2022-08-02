package eleven.stringmethods;

import java.util.stream.Collectors;

public class Java11StringMethods {
  public void run() {

    var string = "This\nis\na\nstring\nwith\nnewlines";

    var spaceString = string.lines().collect(Collectors.joining(" "));

    System.out.println(spaceString);
  }
}
