import java.util.*;

public class Selection_Sort {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = scn.nextInt();

    int arr[] = new int[size];

    System.out.print("Enter the element of array : ");
    for (int i = 0; i < size; i++) {
      arr[i] = scn.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }

    System.out.print("The Selection Sort Array : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
