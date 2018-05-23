public class Counter {

  int a;
  int origin;

  public Counter() {
    origin = 0;
  }

  public Counter(int a){
    this.a = a;
    origin = a;
  }


  public int add(int number) {
    return a += number;
  }

  public int add() {
    return a += 1;
  }

  public int get() {
    return a;
  }

  public int reset() {
    a = origin;
    return a;
  }
}
