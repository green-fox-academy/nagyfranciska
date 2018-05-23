public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    String milk = "Get milk";
    String rem = "Remove the obstacles";
    String stand = "Stand up";
    String eat = "Eat lunch";

    Thing thing1 = new Thing(milk);
    Thing thing2 = new Thing(rem);
    Thing thing3 = new Thing(stand);
    Thing thing4 = new Thing(eat);

    thing3.complete();
    thing4.complete();

    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);
    fleet.add(thing4);

    System.out.println(fleet);
  }
}