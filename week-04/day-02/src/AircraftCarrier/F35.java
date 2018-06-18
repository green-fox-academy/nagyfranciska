package AircraftCarrier;

public class F35 extends AirCrafts{

  public F35(String type, int maxAmmo, int baseDamage) {
    super("F35", 10, 60);
  }

  @Override
  public boolean isPriority() {
    boolean priority = true;
    return priority;
  }
}


