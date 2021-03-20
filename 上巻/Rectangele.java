public class Rectangele {
  int width;  //フィールドの宣言
  int height;  //フィールドの宣言

  //コンストラクタ宣言
  public Rectangele(int width, int height) { 
    this.width = width;
    this.height = height;
  }
  @Override
  public String toString() {
    return "[ " + width + ", " + height + " ]";
  }
}
