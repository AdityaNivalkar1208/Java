// public class Function {

//   public static int sumNum(int a, int b) {
//     int sum = a + b;
//     return sum;
//   }

//   public static void main(String[] args) {
//     int a = 2, b = 2;
//     int result = sumNum(a, b);
//     System.out.println(result);
//   }

//   public static int printFactorial(int n) {
//     int fact = 1;
//     for (int i = 1; i <= n; i++) {
//       fact *= i;
//     }
//     return fact;
//   }

//   public static void main(String[] args) {
//     int n = 5;
//     int factorial = printFactorial(n);
//     System.out.println(factorial);
//   }

//   public static void printFibonacci(int n) {
//     int a = 0, b = 1;

//     if (n >= 1) {
//       System.out.println(a);
//     }
//     if (n >= 2) {
//       System.out.println(b);
//     }

//     for (int i = 3; i <= n; i++) {
//       int nextTerm = a + b;
//       System.out.println(nextTerm);
//       a = b;
//       b = nextTerm;
//     }
//   }

//   public static void main(String[] args) {
//     int n = 5;
//     printFibonacci(n);
//   }
// }

// import java.util.Scanner;

// public class Function {

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     int positiveCount = 0;
//     int negativeCount = 0;
//     int zeroCount = 0;

//     char choice;
//     do {
//       System.out.print("Enter a number: ");
//       int num = scanner.nextInt();

//       if (num > 0) positiveCount++; else if (
//         num < 0
//       ) negativeCount++; else zeroCount++;

//       System.out.print("Do you want to enter another number? (y/n): ");
//       choice = scanner.next().charAt(0);
//     } while (choice == 'y' || choice == 'Y');

//     System.out.println("Number of positive numbers: " + positiveCount);
//     System.out.println("Number of negative numbers: " + negativeCount);
//     System.out.println("Number of zeros: " + zeroCount);

//     scanner.close();
//   }
// }
