// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class Function_Question {

  public static void Question(int number, int power) {
    int result = 1;
    for (int i = 1; i <= power; i++) {
      result *= number;
    }

    System.out.println(result);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int number = scn.nextInt();
    System.out.print("Enter the Power : ");
    int power = scn.nextInt();
    Question(number, power);
  }
}
