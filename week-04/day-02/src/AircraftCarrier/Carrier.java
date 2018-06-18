package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  List<AirCrafts> carrier;
  int ammoStorage;
  int healthPoint;

  public Carrier(int ammo, int health) {
    carrier = new ArrayList<>();
    ammoStorage = ammo;
    healthPoint = health;
  }

  public void add(AirCrafts airCrafts) {
    carrier.add(airCrafts);
  }

  public void fill() {
    int sumAmmoNeed = 0;
    for (int i = 0; i < carrier.size(); i++) {
      sumAmmoNeed += carrier.get(i).maxAmmo - carrier.get(i).currentAmmo;
    }
    if (sumAmmoNeed > ammoStorage) {
      for (int i = 0; i < carrier.size(); i++) {
        if (carrier.get(i).isPriority()) {
          carrier.get(i).refill(carrier.get(i).maxAmmo - carrier.get(i).currentAmmo);
        }
      }
    }
  }

  public void fight(Carrier carrier) {
    for (int i = 0; i < this.carrier.size(); i++) {
      carrier.healthPoint -= this.carrier.get(i).fight();
    }
  }

  public String getStatus() {
    int totalDamage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      totalDamage += carrier.get(i).baseDamage * carrier.get(i).currentAmmo;
    }

    if (totalDamage >= healthPoint) {
      String isDead = "It's dead Jim :(";
      return isDead;
    } else {
      String status = "HP: " + healthPoint + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " + ammoStorage + ", Total damage: " + totalDamage;
      for (AirCrafts aircraft : carrier) {
        status.concat(aircraft.getStatus());
      }
      return status;
    }
  }
}
