class ClassA {
  public static ClassA last = null;
  public String name;
  public ClassA(String name) {
    this.name = name;
    last = this;
    // 生まれたときにメッセージを表示する
    System.out.println(this + "が生まれました。");
  }
  @Override
  public String toString() {
    return "[" + name + "]";
  }
}

class ClassB extends ClassA {
  public ClassA friend;
  public ClassB(String name) {
    super(name);
  }
  public ClassB(String name, ClassA friend) {
    super(name);
    this.friend = friend;
  }
  @Override
  public String toString() {
    return "[" + name + ", " + friend + "]";
  }
}

public class GcQuiz {
  public static ClassA q = new ClassA("ジマイマ");
  public ClassA r = new ClassA("レベッカ");
  public static void main(String[] args) {
    ClassA a = new ClassA("ミドン");       // a = "ミトン"
    ClassA b = new ClassA("トム");        //  b = "トム"
    ClassA c = new ClassA("モペット");    //   c = "モペット"
    ClassB[] arrayA = new ClassB[4];     
    b = c;                               // "トム"はガーベッジ
                                         // b = "モペット"
                                         // c = "モペット"
    for (int i = 0; i < 4; i++) {
      arrayA[i] = new ClassB("犬" + i);
    }
                                        // arrayA[0] = "犬0"
                                        // arrayA[1] = "犬1"
                                        // arrayA[2] = "犬2"
                                        // arrayA[3] = "犬3"
    arrayA[3].friend = arrayA[3];
                                        // array[3] = "犬3"
                                        // "犬3"のfriend = "犬3"
    arrayA[0] = arrayA[1];
                                        // "犬0"はカーベッジ
                                        // arrayA[0] = "犬1"
                                        // arrayA[1] = "犬1"
    c = arrayA[2];
                                        // b = "モペット"
                                        // arrayA[2] = "犬2"
                                        // c = "犬2"
    arrayA[1] = null;
                                        // array[0] = "犬1"
    ClassA d = arrayA[0];
                                        // arrayA[0] = "犬1"
                                        // d = "犬1"
    ClassB arrayB[] = new ClassB[4];
    arrayB[0] = new ClassB("フロプシー", new ClassA("野ネズミ"));
                                        // arrayB[0] = "フロプシー"
                                        // "フロプシー"のfriend = "野ネズミ"
    arrayB[1] = new ClassB("もぷしー", new ClassA("ナトキン"));
                                        // arrayB[1] = "モプシー"
                                        // "モプシー"のfriend = "ナトキン"
    arrayB[2] = new ClassB("カトンテール", c);
                                        // arrayB[2] = "カトンテール"
                                        // arrayA[2] = "犬2"
                                        // c = "犬2"
                                        // "カトンテール"のfriend = "犬2"
    arrayB[3] = new ClassB("ピーター", new ClassA("ベンジャミン"));
                                        // array[3] = "ピーター"
                                        // "ピーター"のfriend = "ベンジャミン"
    arrayA = null;
                                        // d = "犬1"
                                        // c = "犬2"
                                        // カトンテールのfriend = "犬2"
                                        // "犬3"はガーベッジ
    arrayB[0].friend = null;
                                        // "野ネズミ"はガーベッジ
    arrayB[1] = null;
                                        // "モプシー"はカーベッジ
                                        // "ナトキン"もガーベッジ
    arrayB[2] = null;
                                        // "カトンテール"はガーベッジ
                                        // c = "犬2"
    ClassB e = new ClassB("ルーシー", new ClassA("ティギー"));
                                        // e = "ルーシー"
                                        // e.friend = "ティギー"
    e = null;
                                        // Class.last = "ルーシー"
                                        // "ルーシー"のfriend = "ティギー"

    System.gc();
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("e = " + e);
    System.out.println("arrayA = " + arrayA);
    System.out.println("arrayB[0] = " + arrayB[0]);
    System.out.println("arrayB[1] = " + arrayB[1]);
    System.out.println("arrayB[2] = " + arrayB[2]);
    System.out.println("arrayB[3] = " + arrayB[3]);
    System.out.println("ClassA.last = " + ClassA.last);
    System.out.println("GcQuiz.q = " + GcQuiz.q);
  }
}
