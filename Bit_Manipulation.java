// GET BIT

// public class Bit_Manipulation {

//   public static void main(String[] args) {
//     int n = 5;
//     int pos = 3;
//     int bitMask = 1 << pos;

//     if ((bitMask & n) == 0) {
//       System.out.println("Bit was zero");
//     } else {
//       System.out.println("Bit was one");
//     }
//   }
// }

// SET BIT

// public class Bit_Manipulation {

//   public static void main(String[] args) {
//     int n = 5;
//     int pos = 1;
//     int bitMask = 1 << pos;
//     int newNumber = bitMask | n;
//     System.out.println(newNumber);
//   }
// }

// Clear Bit

// public class Bit_Manipulation {

//   public static void main(String[] args) {
//     int n = 5;
//     int pos = 2;
//     int bitMask = 1 << pos;
//     int notBitMask = ~(bitMask);
//     int newNumber = notBitMask & n;
//     System.out.println(newNumber);
//   }
// }

// CLEAR BIT

import java.util.*;

public class Bit_Manipulation {

  public static void main(String[] args) {
    int n = 5;
    int pos = 2;
    Scanner scn = new Scanner(System.in);
    int oper = scn.nextInt();
    // int oper = 1; // Update bit to 1 else update bit to 0
    int bitMask = 1 << pos;
    // set oper
    if (oper == 1) {
      int newNumber = bitMask | n;
      System.out.println(newNumber);
    } else {
      int newBitMask = ~(bitMask);
      int newNumber = newBitMask & n;
      System.out.println(newNumber);
    }
  }
}
