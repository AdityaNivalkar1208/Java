// import java.util.*;

// public class Strings {

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     System.out.print("Enter the String1 : ");
//     String str1 = scn.next();
//     System.out.print("Enter the String2 : ");
//     String str2 = scn.next();
//   }
// }

// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// import java.util.*;

// public class Strings {

//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     String array[] = new String[size];
//     int totLength = 0;

//     for (int i = 0; i < size; i++) {
//       array[i] = sc.next();
//       totLength += array[i].length();
//     }

//     System.out.println(totLength);
//   }
// }

// import java.util.*;

// public class Strings {

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     System.out.print("Enter the String : ");
//     String str = scn.next();
//     String result = "";
//     for (int i = 0; i < str.length(); i++) {
//       if (str.charAt(i) == 'a') {
//         result += 'i';
//       } else {
//         result += str.charAt(i);
//       }
//     }

//     System.out.println(result);
//   }
// }

// import java.util.*;

// public class Strings {

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     System.out.print("Enter the String : ");
//     String str = scn.nextLine();
//     System.out.print("Enter the character to replace : ");
//     char replaceChar = scn.next().charAt(0);

//     String result = replaceFunction(str, replaceChar);

//     System.out.println("Original String : " + str);
//     System.out.println("Replace character of original String : " + result);
//   }

//   public static String replaceFunction(String str, char replaceChar) {
//     return replaceChar + str.substring(1);
//   }
// }

// import java.util.*;

// public class Strings {

//   public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     System.out.print("Enter the Email : ");
//     String email = scn.nextLine();

//     String userName = "";

//     for (int i = 0; i < email.length(); i++) {
//       if (email.charAt(i) == '@') {
//         break;
//       } else {
//         userName += email.charAt(i);
//       }
//     }

//     System.out.println(userName);
//   }
// }

import java.util.*;

public class Strings {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String reverse = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.charAt(i);
    }

    System.out.println(reverse);
  }
}
