package AircraftCarrier;

public abstract class AirCrafts {

  int maxAmmo;
  int currentAmmo;
  int baseDamage;
  String type;

  public AirCrafts(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = 0;
  }

  public boolean isPriority() {
    boolean priority = false;
    return priority;
  }

  public int fight() {
    int damage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return damage;
  }

  public int refill(int number) {
    int refill = maxAmmo - currentAmmo;
    int leftOver;
    if (number < refill) {
      currentAmmo += refill;
      leftOver = 0;
    } else {
      currentAmmo = maxAmmo;
      leftOver = number - refill;
    }
    return leftOver;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    String status = "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * currentAmmo;
    return status;
  }
}
