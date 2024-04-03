// import java.util.*;

// ******
// *    *
// *    *
// *    *
// ******

// public class Pattern {

//   public static void printPattern(int number) {
//     int i, j;

//     for (i = 0; i < number; i++) {
//       for (j = 0; j < number; j++) {
//         if (i == 0 || j == 0 || i == number - 1 || j == number - 1) {
//           System.out.print("*");
//         } else {
//           System.out.print(" ");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     Scanner scn = new Scanner(System.in);
//     int number = scn.nextInt();
//     printPattern(number);
//   }
// }

//       1
//      2 2
//     3 3 3
//    4 4 4 4
//   5 5 5 5 5
//  6 6 6 6 6 6

// import java.util.*;

// public class Pattern {

//   public static void patternPrinting(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       for (j = 1; j <= i; j++) {
//         System.out.print(i + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int number = 6;
//     patternPrinting(number);
//   }
// }

/*
1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
 */

// import java.util.*;

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= i; j++) {
//         System.out.print(j + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int number = 6;
//     printPattern(number);
//   }
// }

/*
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

// import java.util.*;

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;
//     for (i = n; i >= 1; i--) {
//       for (j = 1; j <= i; j++) {
//         System.out.print(j + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int number = 6;
//     printPattern(number);
//   }
// }

/*

1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
16 17 18 19 20 21

*/

// import java.util.*;

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j, num = 1;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= i; j++) {
//         System.out.print(num + " ");
//         num++;
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     printPattern(n);
//   }
// }

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1 
*/

// import java.util.*;

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= i; j++) {
//         if ((i + j) % 2 == 0) {
//           System.out.print(1 + " ");
//         } else {
//           System.out.print(0 + " ");
//         }
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     printPattern(n);
//   }
// }

/*

          1
        2 1 2
      3 2 1 2 3  
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6

*/

// import java.util.*;

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }

//       for (j = i; j >= 1; j--) {
//         System.out.print(j + " ");
//       }ss

//       for (j = 2; j <= i; j++) {
//         System.out.print(j + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int number = 6;
//     printPattern(number);
//   }
// }

// public class Pattern {

//   public static void printPyramid(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }

//       for (j = i; j >= 1; j--) {
//         System.out.print("*" + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printPyramid(n);
//   }
// }

/*

*
* *
* * *
* * * *
* * * * * 

*/

// import java.util.*;

// public class Pattern {

//   public static void printStar(int n) {
//     int i, j;
//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= i; j++) {
//         System.out.print("*" + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printStar(n);
//   }
// }

/*  
          *
        * * 
      * * * 
    * * * *
  * * * * * 
* * * * * *

*/

// public class Pattern {

//   public static void printLeftPyramid(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }

//       for (j = i; j >= 1; j--) {
//         System.out.print("*" + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printLeftPyramid(n);
//   }
// }

/*
          * * * * * *  
        * * * * * *
      * * * * * *
    * * * * * * 
  * * * * * *
* * * * * *

 */

// public class Pattern {

//   public static void printRhombus(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//       }
//       for (j = 1; j <= n; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printRhombus(n);
//   }
// }

/*   

          * 
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
* * * * * * * * * * * 


 */

// public class Pattern {

//   public static void printDiamondShape(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }
//       for (j = i; j >= 1; j--) {
//         System.out.print("*" + " ");
//       }
//       for (j = 2; j <= i; j++) {
//         System.out.print("*" + " ");
//       }

//       System.out.println();
//     }

//     for (i = n - 1; i >= 1; i--) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }
//       for (j = i; j >= 1; j--) {
//         System.out.print("*" + " ");
//       }
//       for (j = 2; j <= i; j++) {
//         System.out.print("*" + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;

//     printDiamondShape(n);
//   }
// }

/* 

*                     *
* *                 * * 
* * *             * * *
* * * *         * * * *
* * * * *     * * * * *
* * * * * * * * * * * *
* * * * *     * * * * *
* * * *         * * * *
* * *             * * * 
* *                 * *  
*                     *

*/

// public class Pattern {

//   public static void printDiamondShape(int n) {
//     int i, j;
//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       int space = 2 * (n - i);
//       for (j = 1; j <= space; j++) {
//         System.out.print(" ");
//       }
//       for (j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//     for (i = n - 1; i >= 1; i--) {
//       for (j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       int space = 2 * (n - i);
//       for (j = 1; j <= space; j++) {
//         System.out.print(" ");
//       }
//       for (j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printDiamondShape(n);
//   }
// }

/*

* * * * * *
* * * * *
* * * *
* * *
* *
*

 */

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = n; i >= 1; i--) {
//       for (j = 1; j <= i; j++) {
//         System.out.print("*" + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printPattern(n);
//   }
// }

/* 

* * * * * *
  * * * * *
    * * * *   
      * * *  
        * *
          * 
    
*/

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j <= 2 * (n - i); j++) {
//         System.out.print(" ");
//       }

//       for (j = i; j >= 1; j--) {
//         System.out.print("*" + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printPattern(n);
//   }
// }

/*

     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

// public class Pattern {

//   public static void printPattern(int n) {
//     int i, j;

//     for (i = 1; i <= n; i++) {
//       for (j = 1; j < i; j++) {
//         System.out.print(" ");
//       }
//       for (j = i; j <= n; j++) {
//         System.out.print(j + " ");
//       }

//       System.out.println();
//     }

//     for (i = n - 1; i >= 1; i--) {
//       for (j = 1; j < i; j++) {
//         System.out.print(" ");
//       }
//       for (j = i; j <= n; j++) {
//         System.out.print(j + " ");
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 6;
//     printPattern(n);
//   }
// }

/*
          *
        *   *
      *       *
    *           *
  *               *       
* * * * * * * * * * *

 */

// public class Pattern {

//   // Function to demonstrate pattern
//   public static void printPattern(int n) {
//     int i, j;

//     // outer loop to handle rows
//     for (i = 1; i <= n; i++) {
//       // inner loop to print spaces.
//       for (j = i; j < n; j++) {
//         System.out.print(" ");
//       }

//       for (j = 1; j <= (2 * i - 1); j++) {
//         // printing stars.
//         if (j == 1 || i == n || j == (2 * i - 1)) {
//           System.out.print("*");
//         }
//         // printing spaces.
//         else {
//           System.out.print(" ");
//         }
//       }

//       System.out.println("");
//     }
//   }

//   // Driver Function
//   public static void main(String args[]) {
//     int n = 6;
//     printPattern(n);
//   }
// }

// PASCAL TRIANGLE

/* 

        1
      1   1
    1   2   1
  1   3   3   1

*/

// public class Pattern {

//   public static void printPattern(int n) {
//     for (int i = 1; i <= n; i++) {
//       for (int j = 0; j <= n - i; j++) {
//         System.out.print(" ");
//       }

//       int x = 1;
//       for (int k = 1; k <= i; k++) {
//         System.out.print(x + " ");
//         x = x * (i - k) / k;
//       }

//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     int n = 4;
//     printPattern(n);
//   }
// }

public class Pattern {

  public static void printPattern(int m, int n) {
    for (int row = 1; row <= m; row++) {
      for (int col = 1; col <= n; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int m = 4, n = 5;
    printPattern(m, n);
  }
}
