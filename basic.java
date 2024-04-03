// import java.util.*;

// public class basic {

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
// System.out.println("hello");

// int a = 20, b = 10, c = 15;

// if (a > b && a > c) {
//   System.out.println(a + " is greater number");
// } else if (b > c && b > a) {
//   System.out.println(b + " is greater number");
// } else {
//   System.out.println(c + " is greater number");
// }

// double random = Math.floor(Math.random() * 10);
// System.out.println("Random Number is " + random);

// char character = 'a';
// System.out.println("Character is " + character);

// Find Even  or odd
// System.out.println("Enter the number : ");
// int number = scn.nextInt();

// if (number % 2 == 0) {
//   System.out.println(number + " is even");
// } else {
//   System.out.println(number + " is odd");
// }

// Find the prime number :

// System.out.println("Enter the prime number : ");
// int prime = scn.nextInt();

// boolean isPrime = true;

// if (prime <= 1) {
//   isPrime = false;
// } else {
//   for (int i = 2; i <= Math.sqrt(prime); i++) {
//     if (prime % i == 0) {
//       isPrime = false;
//       break;
//     }
//   }
// }

// if (isPrime) {
//   System.out.println(prime + " is Prime Number");
// } else {
//   System.out.println(prime + " is not Prime Number");
// }

// Find the Fibonacci Number

// System.out.println("Find the Fibonacci Number : ");
// int fibonacci = scn.nextInt();
// int a = 0, b = 1;

// if (fibonacci >= 1) {
//   System.out.println(a);
// }
// if (fibonacci >= 2) {
//   System.out.println(b);
// }

// for (int i = 3; i <= fibonacci; i++) {
//   int nextTerm = a + b;
//   System.out.println(nextTerm);
//   a = b;
//   b = nextTerm;
// }

// Factorial Number

// System.out.println("Factorial Number : ");
// int num = scn.nextInt();
// int fact = 1;

// if (num < 0) {
//   System.out.println("Factorial number is negative");
// } else {
//   for (int i = 1; i <= num; i++) {
//     fact *= i;
//   }
// }

// System.out.println("factorial of " + num + " is " + fact);

// ARMSTRONG NUMBER

// System.out.println("Enter the ArmStrong Number : ");
// int number = scn.nextInt();
// int sum = 0;

// int temp = number;

// while (temp > 0) {
//   int remainder = temp % 10;
//   sum += remainder * remainder * remainder;
//   temp = temp / 10;
// }

// if (sum == number) {
//   System.out.println("Armstrong Number");
// } else {
//   System.out.println("No ArmStrong Number");
// }

// Find LCM

// System.out.println("Enter the First Number : ");
// int num1 = scn.nextInt();
// System.out.println("Enter the Second Number : ");
// int num2 = scn.nextInt();

// int min = (num1 > num2) ? num1 : num2;

// while (true) {
//   if (min % num1 == 0 && min % num2 == 0) {
//     System.out.println("The LCM is " + min);
//     break;
//   }
//   min++;
// }

// System.out.println("Enter the Reverse Number : ");
// int number = scn.nextInt();
// int temp = number;
// int reverse = 0;

// while (temp != 0) {
//   int remainder = temp % 10;
//   reverse = reverse * 10 + remainder;
//   temp = temp / 10;
// }
// if (number == reverse) {
//   System.out.println("It is Palindrome");
// } else {
//   System.out.println("It is not Palindrome");
// }

// check character or not

// char c = '*';
// if (Character.isAlphabetic(c)) {
//   System.out.println("Yes");
// } else {
//   System.out.println("No");
// }

// char c;
// for (c = 'A'; c <= 'Z'; ++c) {
//   System.out.println(c + " ");
// }

//     System.out.println("Enter the String : ");
//     String str = scn.next();
//     System.out.println(str.length());
//     String reverse = "";
//     for (int i = str.length() - 1; i >= 0; i--) {
//       reverse = reverse + str.charAt(i);
//     }

//     System.out.println(reverse);
//     if (str.equals(reverse)) {
//       System.out.println("It is Palindrome");
//     } else {
//       System.out.println("It is not Palindrome");
//     }
//   }
// }
