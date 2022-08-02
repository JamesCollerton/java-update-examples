import eight.Java8Features;
import eleven.Java11Features;
import nine.Java9Features;
import ten.Java10Features;
import thirteen.Java13Features;
import twelve.Java12Features;

public class NewJavaUpdates {

  public static void main(String[] args) {

    Java8Features java8Features = new Java8Features();
    Java9Features java9Features = new Java9Features();
    Java10Features java10Features = new Java10Features();
    Java11Features java11Features = new Java11Features();
    Java12Features java12Features = new Java12Features();
    Java13Features java13Features = new Java13Features();

    java8Features.run();
    java9Features.run();
    java10Features.run();
    java11Features.run();
    java12Features.run();
    java13Features.run();
  }
}
