import java.io.File;

public class DeleteFile {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("使用法： java DeleteFile1 削除ファイル");
      System.out.println("例： java DeleteFile trash.txt");
      System.exit(0);
    }
    String filename = args[0];
    File file = new File(filename);
    if (file.delete()) {
      System.out.println(filename + "を削除しました");
    } else {
      System.out.println(filename + "は削除できませんでした");
    }
  }
}
