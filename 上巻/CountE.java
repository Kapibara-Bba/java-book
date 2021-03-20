public class CountE {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }
    System.out.println("i = " + i);  //iは有効範囲外なので、コンパイルエラー
    System.out.println("end");
  }
}
