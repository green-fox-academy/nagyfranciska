public class SecondsIdADay {
  public static void main(String[] args) {

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int wholeDayInSeconds = 24 * 60 * 60;
    int currentTime = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
    System.out.println ("Remaining seconds : " + (wholeDayInSeconds - currentTime));

  }
}
