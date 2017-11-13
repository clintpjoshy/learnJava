public class MethodOverloading {

  public static void getName(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void getName(short a, short b) {
    int c = a * b;
    System.out.println(c);
  }

  public static void getName(String str) {
    System.out.println(str);
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 4, 3};
    getName(32000, 32767);
  }
}
