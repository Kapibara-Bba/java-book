package mytool;

public class PublicTool {    //mytoolパッケージ外からpubilcToolクラスはアクセスできる
  public PublicTool() {

  }
}

class Tool {                 //mytoolパッケージ外からToolクラスはアクセスできない
  public Tool() {
  }
}
