public class PowerGraph {
  public static void main(String[] args) {
    for (int i = -8; i <= 8; i++) {
      if (i < 0) {
        printGraph(getPower(i, 2), '-');
      } else {
        printGraph(getPower(i, 2), '+');
      }
    }
  }
  /* xのn乗の計算 */
  public static int getPower(int x, int n) {
    int y = 1;
    for (int i = 0; i < n; i++) {
      y = y * x;
    }
    return y;
  }
  /* '*'でグラフ表示 */
  public static void printGraph(int x) {
    printGraph(x, '*');
  }
  /* 指定した文字でグラフ表示 */
  public static void printGraph(int x, char c) {
    for (int i = 0; i < x; i++) {
      System.out.print(c);
    }
    System.out.println("");
  }
}


/*
・mainメソッド (2~10行目)
  args   引数    String[]型
  i      変数    int型

・getPowerメソッド (12~18行目)
  x      引数    int型
  n      引数    int型
  y      変数    int型
  i      変数    int型

・printGraphメソッド (20~22行目)
  x      引数    int型

・printGraphメソッド (24~29行目)
  x      引数    int型
  c      引数    char型
  i      変数    int型
*/