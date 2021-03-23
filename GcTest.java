public class GcTest {
  public static void main(String[] args) {
    while (true) {
      String s = new String("ABCDEFGHIJKLMNOPQLSTUVWXYZ");
      System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
    }
  }
}
