public class ReservedMain {
  public static void main(String[] args) {

    Reservation reservation = new Reservation();

    for (int i = 0; i < 5; i++) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());

    }

  }
}
