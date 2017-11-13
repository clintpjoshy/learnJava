public class InsertionSort{

  public void sort(int arr[]) {
    int len = arr.length;
    for (int i = 1; i < len; i++) {
      int key = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  static void printArray(int arr[]) {
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr = {5, 3, 2, 1, 0};
    InsertionSort sort = new InsertionSort();
    sort.sort(arr);
    printArray(arr);
  }
}
