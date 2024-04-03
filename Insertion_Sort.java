import java.util.*;

public class Insertion_Sort {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = scn.nextInt();

    int arr[] = new int[size];

    System.out.print("Enter the element of array : ");

    for (int i = 0; i < size; i++) {
      arr[i] = scn.nextInt();
    }

    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && current < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }

    System.out.print("Insertion Sort Array : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
