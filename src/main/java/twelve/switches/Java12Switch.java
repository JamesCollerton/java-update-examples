package twelve.switches;

public class Java12Switch {

  private enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
  };

  public void run() {

    Weekday weekday = Weekday.FRIDAY;

    String resultString;

    switch (weekday) {
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
      case THURSDAY:
        resultString = "It's not Friday.";
        break;
      case FRIDAY:
        resultString = "It's Friday!";
        break;
      default:
        resultString = "This shouldn't happen...";
        break;
    }

    System.out.println(resultString);

    var secondResultString = switch (weekday) {
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> "It's not Friday.";
      case FRIDAY -> {
        System.out.println("Demonstrating yield.");
        yield "It's Friday!";
      }
    };

    System.out.println(secondResultString);
  }
}
