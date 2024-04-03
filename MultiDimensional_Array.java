import java.util.Scanner;

public class MultiDimensional_Array {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter the size of rows : ");
    int row = scn.nextInt();
    System.out.print("Enter the size of Cols : ");
    int col = scn.nextInt();

    System.out.println("Enter the numbers of Rows & Cols : ");
    int number[][] = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        number[i][j] = scn.nextInt();
      }
    }

    System.out.print("Find the number you want : ");
    int find_Number = scn.nextInt();

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (number[i][j] == find_Number) {
          System.out.println(
            find_Number + " found at position (" + i + ", " + j + ")"
          );
        }
      }
    }
  }
}
