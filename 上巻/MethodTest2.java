//配列を戻り値にする方法２

public class MethodTest2 {
  public static String[] getYourName() {
    String[] myoji_name = new String[2];
    myoji_name[0] = "結城";
    myoji_name[1] = "浩";
    return myoji_name;
  }
  public static void main(String[] args) {
    String[] s = getYourName();
    System.out.println("名字は" + s[0]);
    System.out.println("名前は" + s[1]);
  }
}
