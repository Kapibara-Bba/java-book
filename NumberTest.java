public class NumberTest {
  public static void main(String[] args) {
    try {
      String number = "XYZ";
      int val = Integer.parseInt(number);
      System.out.println("val = " + val);
    } catch (NumberFormatException e) {
      System.out.println("例外:" + e);
    }
  }
}
