// Take a array as an input from user. Search for the given number X and print index at which it occurs.

import java.util.*;

public class Array_Questions {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int size = scn.nextInt();

    int number[] = new int[size];

    System.out.println("Enter the Array Numbers : ");
    for (int i = 0; i < size; i++) {
      number[i] = scn.nextInt();
    }

    System.out.print("Find the number in array : ");
    int find_number = scn.nextInt();

    for (int i = 0; i < number.length; i++) {
      if (number[i] == find_number) {
        System.out.println(
          "The Number " + find_number + " is Found At positon " + i
        );
      }
    }
  }
}
