
//配列を戻り値にする方法１

public class MethodTest1 {
  public static String[] getYourName() {
    String[] myoji_name = { "結城", "浩" };
    return myoji_name;
  }
  public static void main(String[] args) {
    String[] s = getYourName();
    System.out.println("名字は" + s[0]);
    System.out.println("名前は" + s[1]);
  }
}
