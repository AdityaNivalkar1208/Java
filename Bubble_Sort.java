import java.util.*;

public class Bubble_Sort {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = scn.nextInt();

    int arr[] = new int[size];

    System.out.print("Enter the element of array : ");
    for (int i = 0; i < size; i++) {
      arr[i] = scn.nextInt();
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.print("Bubble Sort : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
