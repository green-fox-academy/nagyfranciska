package reserved;
import java.util.Random;

public class Reservation implements Reservatiory {

  String[] dow;

  public Reservation() {
    dow = new String [] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  }

  @Override
  public String getDowBooking() {
    Random r = new Random();
    return dow[r.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    String uniCode = "";
    Random b = new Random();


    for (int i = 0; i < 8; i++) {
      if (Math.random() <= 0.5) {
        uniCode += (char)(b.nextInt(26) + 'A');
      } else {
        uniCode += (char)(b.nextInt(10) + '0');
      }




      // char c = (char) ((int) Math.random() * 10 + 89);
//      if (c > 57 && c < 89) {
//        uniCode += c + 8;
//      } else if (c < 57 && c > 48) {
//        uniCode += c;
//      }
    }
    return uniCode;
  }
}
