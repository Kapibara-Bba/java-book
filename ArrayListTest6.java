import java.util.*;

public class ArrayListTest6 {
  public static void main(String[] args) {
    // ArrayListのインスタンスの確保
    ArrayList<String> list = new ArrayList<String>();

    // 要素の追加 (addメソッド)
    list.add("Alice");
    list.add("Bob");
    list.add("Chris");
    list.add("Diana");
    list.add("Elmo");

    // 削除前に要素を表示
    System.out.println("削除の前");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + ":" + list.get(i));
    }
    System.out.println();

    // AliceとBobとElmoを削除
    list.remove("Alice");
    list.remove("Bob");
    list.remove("Elmo");

    // 削除後に要素を表示
    System.out.println("削除の後");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + ":" + list.get(i));
    }
    System.out.println();

    // Aliceは含まれているか
    if (list.contains("Alice")) {
      System.out.println("listにAliceは含まれているます。");
    } else {
      System.out.println("listにAliceは含まれていません。");
    }
  }
}
