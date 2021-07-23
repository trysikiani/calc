import java.util.Scanner;

public class stringi {
    static int num1, num2;
    static String a, b, q, j;
    static char operation;
    static int result;

public static void main(String[] args) {
    System.out.println("Введите операцию через пробел, Господин.");
    Scanner s = new Scanner(System.in);
    q = s.nextLine();



    String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"  };

// s  l  o  z  h  e  n  i  e

    if (q.equals("0 + " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 + " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[1] + " + 0")) {System.out.println("London is the capital of Great Britain");}
    if (q.equals(roman[1] + " + " + roman[1])) {System.out.println(roman[2]);}
    if (q.equals(roman[1] + " + " + roman[2])) {System.out.println(roman[3]);}
    if (q.equals(roman[1] + " + " + roman[3])) {System.out.println(roman[4]);}
    if (q.equals(roman[1] + " + " + roman[4])) {System.out.println(roman[5]);}
    if (q.equals(roman[1] + " + " + roman[5])) {System.out.println(roman[6]);}
    if (q.equals(roman[1] + " + " + roman[6])) {System.out.println(roman[7]);}
    if (q.equals(roman[1] + " + " + roman[7])) {System.out.println(roman[8]);}
    if (q.equals(roman[1] + " + " + roman[8])) {System.out.println(roman[9]);}
    if (q.equals(roman[1] + " + " + roman[9])) {System.out.println(roman[10]);}
    if (q.equals(roman[1] + " + " + roman[10])) {System.out.println(roman[11]);}

    if (q.equals(roman[2] + " + 0")) {System.out.println("E = mc2");}
    if (q.equals(roman[2] + " + " + roman[1])) {System.out.println(roman[3]);}
    if (q.equals(roman[2] + " + " + roman[2])) {System.out.println(roman[4]);}
    if (q.equals(roman[2] + " + " + roman[3])) {System.out.println(roman[5]);}
    if (q.equals(roman[2] + " + " + roman[4])) {System.out.println(roman[6]);}
    if (q.equals(roman[2] + " + " + roman[5])) {System.out.println(roman[7]);}
    if (q.equals(roman[2] + " + " + roman[6])) {System.out.println(roman[8]);}
    if (q.equals(roman[2] + " + " + roman[7])) {System.out.println(roman[9]);}
    if (q.equals(roman[2] + " + " + roman[8])) {System.out.println(roman[10]);}
    if (q.equals(roman[2] + " + " + roman[9])) {System.out.println(roman[11]);}
    if (q.equals(roman[2] + " + " + roman[10])) {System.out.println(roman[12]);}

    if (q.equals(roman[3] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " + " + roman[1])) {System.out.println(roman[4]);}
    if (q.equals(roman[3] + " + " + roman[2])) {System.out.println(roman[5]);}
    if (q.equals(roman[3] + " + " + roman[3])) {System.out.println(roman[6]);}
    if (q.equals(roman[3] + " + " + roman[4])) {System.out.println(roman[7]);}
    if (q.equals(roman[3] + " + " + roman[5])) {System.out.println(roman[8]);}
    if (q.equals(roman[3] + " + " + roman[6])) {System.out.println(roman[9]);}
    if (q.equals(roman[3] + " + " + roman[7])) {System.out.println(roman[10]);}
    if (q.equals(roman[3] + " + " + roman[8])) {System.out.println(roman[11]);}
    if (q.equals(roman[3] + " + " + roman[9])) {System.out.println(roman[12]);}
    if (q.equals(roman[3] + " + " + roman[10])) {System.out.println(roman[13]);}

    if (q.equals(roman[4] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " + " + roman[1])) {System.out.println(roman[5]);}
    if (q.equals(roman[4] + " + " + roman[2])) {System.out.println(roman[6]);}
    if (q.equals(roman[4] + " + " + roman[3])) {System.out.println(roman[7]);}
    if (q.equals(roman[4] + " + " + roman[4])) {System.out.println(roman[8]);}
    if (q.equals(roman[4] + " + " + roman[5])) {System.out.println(roman[9]);}
    if (q.equals(roman[4] + " + " + roman[6])) {System.out.println(roman[10]);}
    if (q.equals(roman[4] + " + " + roman[7])) {System.out.println(roman[11]);}
    if (q.equals(roman[4] + " + " + roman[8])) {System.out.println(roman[12]);}
    if (q.equals(roman[4] + " + " + roman[9])) {System.out.println(roman[13]);}
    if (q.equals(roman[4] + " + " + roman[10])) {System.out.println(roman[14]);}

    if (q.equals(roman[5] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " + " + roman[1])) {System.out.println(roman[6]);}
    if (q.equals(roman[5] + " + " + roman[2])) {System.out.println(roman[7]);}
    if (q.equals(roman[5] + " + " + roman[3])) {System.out.println(roman[8]);}
    if (q.equals(roman[5] + " + " + roman[4])) {System.out.println(roman[9]);}
    if (q.equals(roman[5] + " + " + roman[5])) {System.out.println(roman[10]);}
    if (q.equals(roman[5] + " + " + roman[6])) {System.out.println(roman[11]);}
    if (q.equals(roman[5] + " + " + roman[7])) {System.out.println(roman[12]);}
    if (q.equals(roman[5] + " + " + roman[8])) {System.out.println(roman[13]);}
    if (q.equals(roman[5] + " + " + roman[9])) {System.out.println(roman[14]);}
    if (q.equals(roman[5] + " + " + roman[10])) {System.out.println(roman[15]);}

    if (q.equals(roman[6] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " + " + roman[1])) {System.out.println(roman[7]);}
    if (q.equals(roman[6] + " + " + roman[2])) {System.out.println(roman[8]);}
    if (q.equals(roman[6] + " + " + roman[3])) {System.out.println(roman[9]);}
    if (q.equals(roman[6] + " + " + roman[4])) {System.out.println(roman[10]);}
    if (q.equals(roman[6] + " + " + roman[5])) {System.out.println(roman[11]);}
    if (q.equals(roman[6] + " + " + roman[6])) {System.out.println(roman[12]);}
    if (q.equals(roman[6] + " + " + roman[7])) {System.out.println(roman[13]);}
    if (q.equals(roman[6] + " + " + roman[8])) {System.out.println(roman[14]);}
    if (q.equals(roman[6] + " + " + roman[9])) {System.out.println(roman[15]);}
    if (q.equals(roman[6] + " + " + roman[10])) {System.out.println(roman[16]);}

    if (q.equals(roman[7] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " + " + roman[1])) {System.out.println(roman[8]);}
    if (q.equals(roman[7] + " + " + roman[2])) {System.out.println(roman[9]);}
    if (q.equals(roman[7] + " + " + roman[3])) {System.out.println(roman[10]);}
    if (q.equals(roman[7] + " + " + roman[4])) {System.out.println(roman[11]);}
    if (q.equals(roman[7] + " + " + roman[5])) {System.out.println(roman[12]);}
    if (q.equals(roman[7] + " + " + roman[6])) {System.out.println(roman[13]);}
    if (q.equals(roman[7] + " + " + roman[7])) {System.out.println(roman[14]);}
    if (q.equals(roman[7] + " + " + roman[8])) {System.out.println(roman[15]);}
    if (q.equals(roman[7] + " + " + roman[9])) {System.out.println(roman[16]);}
    if (q.equals(roman[7] + " + " + roman[10])) {System.out.println(roman[17]);}

    if (q.equals(roman[8] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " + " + roman[1])) {System.out.println(roman[9]);}
    if (q.equals(roman[8] + " + " + roman[2])) {System.out.println(roman[10]);}
    if (q.equals(roman[8] + " + " + roman[3])) {System.out.println(roman[11]);}
    if (q.equals(roman[8] + " + " + roman[4])) {System.out.println(roman[12]);}
    if (q.equals(roman[8] + " + " + roman[5])) {System.out.println(roman[13]);}
    if (q.equals(roman[8] + " + " + roman[6])) {System.out.println(roman[14]);}
    if (q.equals(roman[8] + " + " + roman[7])) {System.out.println(roman[15]);}
    if (q.equals(roman[8] + " + " + roman[8])) {System.out.println(roman[16]);}
    if (q.equals(roman[8] + " + " + roman[9])) {System.out.println(roman[17]);}
    if (q.equals(roman[8] + " + " + roman[10])) {System.out.println(roman[18]);}

    if (q.equals(roman[9] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[9] + " + " + roman[1])) {System.out.println(roman[10]);}
    if (q.equals(roman[9] + " + " + roman[2])) {System.out.println(roman[11]);}
    if (q.equals(roman[9] + " + " + roman[3])) {System.out.println(roman[12]);}
    if (q.equals(roman[9] + " + " + roman[4])) {System.out.println(roman[13]);}
    if (q.equals(roman[9] + " + " + roman[5])) {System.out.println(roman[14]);}
    if (q.equals(roman[9] + " + " + roman[6])) {System.out.println(roman[15]);}
    if (q.equals(roman[9] + " + " + roman[7])) {System.out.println(roman[16]);}
    if (q.equals(roman[9] + " + " + roman[8])) {System.out.println(roman[17]);}
    if (q.equals(roman[9] + " + " + roman[9])) {System.out.println(roman[18]);}
    if (q.equals(roman[9] + " + " + roman[10])) {System.out.println(roman[19]);}

    if (q.equals(roman[10] + " + 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[10] + " + " + roman[1])) {System.out.println(roman[11]);}
    if (q.equals(roman[10] + " + " + roman[2])) {System.out.println(roman[12]);}
    if (q.equals(roman[10] + " + " + roman[3])) {System.out.println(roman[13]);}
    if (q.equals(roman[10] + " + " + roman[4])) {System.out.println(roman[14]);}
    if (q.equals(roman[10] + " + " + roman[5])) {System.out.println(roman[15]);}
    if (q.equals(roman[10] + " + " + roman[6])) {System.out.println(roman[16]);}
    if (q.equals(roman[10] + " + " + roman[7])) {System.out.println(roman[17]);}
    if (q.equals(roman[10] + " + " + roman[8])) {System.out.println(roman[18]);}
    if (q.equals(roman[10] + " + " + roman[9])) {System.out.println(roman[19]);}
    if (q.equals(roman[10] + " + " + roman[10])) {System.out.println(roman[20]);}

    // m       i       n       u       s

    if (q.equals("0 - " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 - " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[1] + " - 0")) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[1])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[2])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[3])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[4])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[5])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[6])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[1] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[2] + " - 0")) {System.out.println("E = mc2");}
    if (q.equals(roman[2] + " - " + roman[1])) {System.out.println(roman[1]);}
    if (q.equals(roman[2] + " - " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[3])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[4])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[5])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[6])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[2] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[3] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[1])) {System.out.println(roman[2]);}
    if (q.equals(roman[3] + " - " + roman[2])) {System.out.println(roman[1]);}
    if (q.equals(roman[3] + " - " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[4])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[5])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[6])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[3] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[4] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[1])) {System.out.println(roman[3]);}
    if (q.equals(roman[4] + " - " + roman[2])) {System.out.println(roman[2]);}
    if (q.equals(roman[4] + " - " + roman[3])) {System.out.println(roman[1]);}
    if (q.equals(roman[4] + " - " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[5])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[6])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[4] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[5] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[1])) {System.out.println(roman[4]);}
    if (q.equals(roman[5] + " - " + roman[2])) {System.out.println(roman[3]);}
    if (q.equals(roman[5] + " - " + roman[3])) {System.out.println(roman[2]);}
    if (q.equals(roman[5] + " - " + roman[4])) {System.out.println(roman[1]);}
    if (q.equals(roman[5] + " - " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[6])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[5] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[6] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " - " + roman[1])) {System.out.println(roman[5]);}
    if (q.equals(roman[6] + " - " + roman[2])) {System.out.println(roman[4]);}
    if (q.equals(roman[6] + " - " + roman[3])) {System.out.println(roman[3]);}
    if (q.equals(roman[6] + " - " + roman[4])) {System.out.println(roman[2]);}
    if (q.equals(roman[6] + " - " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[6] + " - " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " - " + roman[7])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[6] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[6] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[6] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[7] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " - " + roman[1])) {System.out.println(roman[6]);}
    if (q.equals(roman[7] + " - " + roman[2])) {System.out.println(roman[5]);}
    if (q.equals(roman[7] + " - " + roman[3])) {System.out.println(roman[4]);}
    if (q.equals(roman[7] + " - " + roman[4])) {System.out.println(roman[3]);}
    if (q.equals(roman[7] + " - " + roman[5])) {System.out.println(roman[2]);}
    if (q.equals(roman[7] + " - " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[7] + " - " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " - " + roman[8])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[7] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[7] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[8] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " - " + roman[1])) {System.out.println(roman[7]);}
    if (q.equals(roman[8] + " - " + roman[2])) {System.out.println(roman[6]);}
    if (q.equals(roman[8] + " - " + roman[3])) {System.out.println(roman[5]);}
    if (q.equals(roman[8] + " - " + roman[4])) {System.out.println(roman[4]);}
    if (q.equals(roman[8] + " - " + roman[5])) {System.out.println(roman[3]);}
    if (q.equals(roman[8] + " - " + roman[6])) {System.out.println(roman[2]);}
    if (q.equals(roman[8] + " - " + roman[7])) {System.out.println(roman[1]);}
    if (q.equals(roman[8] + " - " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " - " + roman[9])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}
    if (q.equals(roman[8] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[9] + " - 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[9] + " - " + roman[1])) {System.out.println(roman[8]);}
    if (q.equals(roman[9] + " - " + roman[2])) {System.out.println(roman[7]);}
    if (q.equals(roman[9] + " - " + roman[3])) {System.out.println(roman[6]);}
    if (q.equals(roman[9] + " - " + roman[4])) {System.out.println(roman[5]);}
    if (q.equals(roman[9] + " - " + roman[5])) {System.out.println(roman[4]);}
    if (q.equals(roman[9] + " - " + roman[6])) {System.out.println(roman[3]);}
    if (q.equals(roman[9] + " - " + roman[7])) {System.out.println(roman[2]);}
    if (q.equals(roman[9] + " - " + roman[8])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " - " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[9] + " - " + roman[10])) {System.out.println("THERE IS NO NEGATIVE FOR ROMAN");}

    if (q.equals(roman[10] + " - 0" )){System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[10] + " - " + roman[1])) {System.out.println(roman[9]);}
    if (q.equals(roman[10] + " - " + roman[2])) {System.out.println(roman[8]);}
    if (q.equals(roman[10] + " - " + roman[3])) {System.out.println(roman[7]);}
    if (q.equals(roman[10] + " - " + roman[4])) {System.out.println(roman[6]);}
    if (q.equals(roman[10] + " - " + roman[5])) {System.out.println(roman[5]);}
    if (q.equals(roman[10] + " - " + roman[6])) {System.out.println(roman[4]);}
    if (q.equals(roman[10] + " - " + roman[7])) {System.out.println(roman[3]);}
    if (q.equals(roman[10] + " - " + roman[8])) {System.out.println(roman[2]);}
    if (q.equals(roman[10] + " - " + roman[9])) {System.out.println(roman[1]);}
    if (q.equals(roman[10] + " - " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    // y   m   n   o   z   h   e   n  i  e

    if (q.equals("0 * " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 * " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[1] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " * " + roman[1])) {System.out.println(roman[1]);}
    if (q.equals(roman[1] + " * " + roman[2])) {System.out.println(roman[2]);}
    if (q.equals(roman[1] + " * " + roman[3])) {System.out.println(roman[3]);}
    if (q.equals(roman[1] + " * " + roman[4])) {System.out.println(roman[4]);}
    if (q.equals(roman[1] + " * " + roman[5])) {System.out.println(roman[5]);}
    if (q.equals(roman[1] + " * " + roman[6])) {System.out.println(roman[6]);}
    if (q.equals(roman[1] + " * " + roman[7])) {System.out.println(roman[7]);}
    if (q.equals(roman[1] + " * " + roman[8])) {System.out.println(roman[8]);}
    if (q.equals(roman[1] + " * " + roman[9])) {System.out.println(roman[9]);}
    if (q.equals(roman[1] + " * " + roman[10])) {System.out.println(roman[10]);}

    if (q.equals(roman[2] + " * 0")) {System.out.println("E = mc2");}
    if (q.equals(roman[2] + " * " + roman[1])) {System.out.println(roman[2]);}
    if (q.equals(roman[2] + " * " + roman[2])) {System.out.println(roman[4]);}
    if (q.equals(roman[2] + " * " + roman[3])) {System.out.println(roman[6]);}
    if (q.equals(roman[2] + " * " + roman[4])) {System.out.println(roman[8]);}
    if (q.equals(roman[2] + " * " + roman[5])) {System.out.println(roman[10]);}
    if (q.equals(roman[2] + " * " + roman[6])) {System.out.println(roman[12]);}
    if (q.equals(roman[2] + " * " + roman[7])) {System.out.println(roman[14]);}
    if (q.equals(roman[2] + " * " + roman[8])) {System.out.println(roman[16]);}
    if (q.equals(roman[2] + " * " + roman[9])) {System.out.println(roman[18]);}
    if (q.equals(roman[2] + " * " + roman[10])) {System.out.println(roman[20]);}

    if (q.equals(roman[3] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " * " + roman[1])) {System.out.println(roman[3]);}
    if (q.equals(roman[3] + " * " + roman[2])) {System.out.println(roman[6]);}
    if (q.equals(roman[3] + " * " + roman[3])) {System.out.println(roman[9]);}
    if (q.equals(roman[3] + " * " + roman[4])) {System.out.println(roman[12]);}
    if (q.equals(roman[3] + " * " + roman[5])) {System.out.println(roman[15]);}
    if (q.equals(roman[3] + " * " + roman[6])) {System.out.println(roman[18]);}
    if (q.equals(roman[3] + " * " + roman[7])) {System.out.println(roman[21]);}
    if (q.equals(roman[3] + " * " + roman[8])) {System.out.println(roman[24]);}
    if (q.equals(roman[3] + " * " + roman[9])) {System.out.println(roman[27]);}
    if (q.equals(roman[3] + " * " + roman[10])) {System.out.println(roman[30]);}

    if (q.equals(roman[4] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " * " + roman[1])) {System.out.println(roman[4]);}
    if (q.equals(roman[4] + " * " + roman[2])) {System.out.println(roman[8]);}
    if (q.equals(roman[4] + " * " + roman[3])) {System.out.println(roman[12]);}
    if (q.equals(roman[4] + " * " + roman[4])) {System.out.println(roman[16]);}
    if (q.equals(roman[4] + " * " + roman[5])) {System.out.println(roman[20]);}
    if (q.equals(roman[4] + " * " + roman[6])) {System.out.println(roman[24]);}
    if (q.equals(roman[4] + " * " + roman[7])) {System.out.println(roman[28]);}
    if (q.equals(roman[4] + " * " + roman[8])) {System.out.println(roman[32]);}
    if (q.equals(roman[4] + " * " + roman[9])) {System.out.println(roman[36]);}
    if (q.equals(roman[4] + " * " + roman[10])) {System.out.println(roman[40]);}

    if (q.equals(roman[5] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " * " + roman[1])) {System.out.println(roman[5]);}
    if (q.equals(roman[5] + " * " + roman[2])) {System.out.println(roman[10]);}
    if (q.equals(roman[5] + " * " + roman[3])) {System.out.println(roman[15]);}
    if (q.equals(roman[5] + " * " + roman[4])) {System.out.println(roman[20]);}
    if (q.equals(roman[5] + " * " + roman[5])) {System.out.println(roman[25]);}
    if (q.equals(roman[5] + " * " + roman[6])) {System.out.println(roman[30]);}
    if (q.equals(roman[5] + " * " + roman[7])) {System.out.println(roman[35]);}
    if (q.equals(roman[5] + " * " + roman[8])) {System.out.println(roman[40]);}
    if (q.equals(roman[5] + " * " + roman[9])) {System.out.println(roman[45]);}
    if (q.equals(roman[5] + " * " + roman[10])) {System.out.println(roman[50]);}

    if (q.equals(roman[6] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " * " + roman[1])) {System.out.println(roman[6]);}
    if (q.equals(roman[6] + " * " + roman[2])) {System.out.println(roman[12]);}
    if (q.equals(roman[6] + " * " + roman[3])) {System.out.println(roman[18]);}
    if (q.equals(roman[6] + " * " + roman[4])) {System.out.println(roman[24]);}
    if (q.equals(roman[6] + " * " + roman[5])) {System.out.println(roman[30]);}
    if (q.equals(roman[6] + " * " + roman[6])) {System.out.println(roman[36]);}
    if (q.equals(roman[6] + " * " + roman[7])) {System.out.println(roman[42]);}
    if (q.equals(roman[6] + " * " + roman[8])) {System.out.println(roman[48]);}
    if (q.equals(roman[6] + " * " + roman[9])) {System.out.println(roman[54]);}
    if (q.equals(roman[6] + " * " + roman[10])) {System.out.println(roman[60]);}

    if (q.equals(roman[7] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " * " + roman[1])) {System.out.println(roman[7]);}
    if (q.equals(roman[7] + " * " + roman[2])) {System.out.println(roman[14]);}
    if (q.equals(roman[7] + " * " + roman[3])) {System.out.println(roman[21]);}
    if (q.equals(roman[7] + " * " + roman[4])) {System.out.println(roman[28]);}
    if (q.equals(roman[7] + " * " + roman[5])) {System.out.println(roman[35]);}
    if (q.equals(roman[7] + " * " + roman[6])) {System.out.println(roman[42]);}
    if (q.equals(roman[7] + " * " + roman[7])) {System.out.println(roman[49]);}
    if (q.equals(roman[7] + " * " + roman[8])) {System.out.println(roman[56]);}
    if (q.equals(roman[7] + " * " + roman[9])) {System.out.println(roman[63]);}
    if (q.equals(roman[7] + " * " + roman[10])) {System.out.println(roman[70]);}

    if (q.equals(roman[8] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " * " + roman[1])) {System.out.println(roman[8]);}
    if (q.equals(roman[8] + " * " + roman[2])) {System.out.println(roman[16]);}
    if (q.equals(roman[8] + " * " + roman[3])) {System.out.println(roman[24]);}
    if (q.equals(roman[8] + " * " + roman[4])) {System.out.println(roman[32]);}
    if (q.equals(roman[8] + " * " + roman[5])) {System.out.println(roman[40]);}
    if (q.equals(roman[8] + " * " + roman[6])) {System.out.println(roman[48]);}
    if (q.equals(roman[8] + " * " + roman[7])) {System.out.println(roman[56]);}
    if (q.equals(roman[8] + " * " + roman[8])) {System.out.println(roman[64]);}
    if (q.equals(roman[8] + " * " + roman[9])) {System.out.println(roman[72]);}
    if (q.equals(roman[8] + " * " + roman[10])) {System.out.println(roman[80]);}

    if (q.equals(roman[9] + " * 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[9] + " * " + roman[1])) {System.out.println(roman[9]);}
    if (q.equals(roman[9] + " * " + roman[2])) {System.out.println(roman[18]);}
    if (q.equals(roman[9] + " * " + roman[3])) {System.out.println(roman[27]);}
    if (q.equals(roman[9] + " * " + roman[4])) {System.out.println(roman[36]);}
    if (q.equals(roman[9] + " * " + roman[5])) {System.out.println(roman[45]);}
    if (q.equals(roman[9] + " * " + roman[6])) {System.out.println(roman[54]);}
    if (q.equals(roman[9] + " * " + roman[7])) {System.out.println(roman[63]);}
    if (q.equals(roman[9] + " * " + roman[8])) {System.out.println(roman[72]);}
    if (q.equals(roman[9] + " * " + roman[9])) {System.out.println(roman[81]);}
    if (q.equals(roman[9] + " * " + roman[10])) {System.out.println(roman[90]);}

    if (q.equals(roman[10] + " * 0" )){System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[10] + " * " + roman[1])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[2])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[3])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[4])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[5])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[6])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[7])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[8])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[9])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " * " + roman[10])) {System.out.println(roman[10]);}

    // d  e  l  e  n  i  e

    if (q.equals("0 / " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals("0 / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[1] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[1])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[2])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[1] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[2] + " / 0")) {System.out.println("E = mc2");}
    if (q.equals(roman[2] + " / " + roman[1])) {System.out.println(roman[2]);}
    if (q.equals(roman[2] + " / " + roman[2])) {System.out.println(roman[1]);}
    if (q.equals(roman[2] + " / " + roman[3])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[2] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[3] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[1])) {System.out.println(roman[3]);}
    if (q.equals(roman[3] + " / " + roman[2])) {System.out.println(roman[1]);}
    if (q.equals(roman[3] + " / " + roman[3])) {System.out.println(roman[1]);}
    if (q.equals(roman[3] + " / " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[3] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[4] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[1])) {System.out.println(roman[4]);}
    if (q.equals(roman[4] + " / " + roman[2])) {System.out.println(roman[2]);}
    if (q.equals(roman[4] + " / " + roman[3])) {System.out.println(roman[1]);}
    if (q.equals(roman[4] + " / " + roman[4])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[5])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[4] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[5] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " / " + roman[1])) {System.out.println(roman[5]);}
    if (q.equals(roman[5] + " / " + roman[2])) {System.out.println(roman[2]);}
    if (q.equals(roman[5] + " / " + roman[3])) {System.out.println(roman[1]);}
    if (q.equals(roman[5] + " / " + roman[4])) {System.out.println(roman[1]);}
    if (q.equals(roman[5] + " / " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[5] + " / " + roman[6])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[5] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[6] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " / " + roman[1])) {System.out.println(roman[6]);}
    if (q.equals(roman[6] + " / " + roman[2])) {System.out.println(roman[3]);}
    if (q.equals(roman[6] + " / " + roman[3])) {System.out.println(roman[2]);}
    if (q.equals(roman[6] + " / " + roman[4])) {System.out.println(roman[1]);}
    if (q.equals(roman[6] + " / " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[6] + " / " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[6] + " / " + roman[7])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[6] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[7] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " / " + roman[1])) {System.out.println(roman[7]);}
    if (q.equals(roman[7] + " / " + roman[2])) {System.out.println(roman[3]);}
    if (q.equals(roman[7] + " / " + roman[3])) {System.out.println(roman[2]);}
    if (q.equals(roman[7] + " / " + roman[4])) {System.out.println(roman[1]);}
    if (q.equals(roman[7] + " / " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[7] + " / " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[7] + " / " + roman[7])) {System.out.println(roman[1]);}
    if (q.equals(roman[7] + " / " + roman[8])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[7] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[8] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " / " + roman[1])) {System.out.println(roman[8]);}
    if (q.equals(roman[8] + " / " + roman[2])) {System.out.println(roman[4]);}
    if (q.equals(roman[8] + " / " + roman[3])) {System.out.println(roman[2]);}
    if (q.equals(roman[8] + " / " + roman[4])) {System.out.println(roman[2]);}
    if (q.equals(roman[8] + " / " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[8] + " / " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[8] + " / " + roman[7])) {System.out.println(roman[1]);}
    if (q.equals(roman[8] + " / " + roman[8])) {System.out.println(roman[1]);}
    if (q.equals(roman[8] + " / " + roman[9])) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[8] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[9] + " / 0")) {System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[9] + " / " + roman[1])) {System.out.println(roman[9]);}
    if (q.equals(roman[9] + " / " + roman[2])) {System.out.println(roman[4]);}
    if (q.equals(roman[9] + " / " + roman[3])) {System.out.println(roman[3]);}
    if (q.equals(roman[9] + " / " + roman[4])) {System.out.println(roman[2]);}
    if (q.equals(roman[9] + " / " + roman[5])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " / " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " / " + roman[7])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " / " + roman[8])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " / " + roman[9])) {System.out.println(roman[1]);}
    if (q.equals(roman[9] + " / " + roman[10])) {System.out.println("NO NULL FOR ROMAN");}

    if (q.equals(roman[10] + " / 0" )){System.out.println("NO NULL FOR ROMAN");}
    if (q.equals(roman[10] + " / " + roman[1])) {System.out.println(roman[10]);}
    if (q.equals(roman[10] + " / " + roman[2])) {System.out.println(roman[5]);}
    if (q.equals(roman[10] + " / " + roman[3])) {System.out.println(roman[3]);}
    if (q.equals(roman[10] + " / " + roman[4])) {System.out.println(roman[2]);}
    if (q.equals(roman[10] + " / " + roman[5])) {System.out.println(roman[2]);}
    if (q.equals(roman[10] + " / " + roman[6])) {System.out.println(roman[1]);}
    if (q.equals(roman[10] + " / " + roman[7])) {System.out.println(roman[1]);}
    if (q.equals(roman[10] + " / " + roman[8])) {System.out.println(roman[1]);}
    if (q.equals(roman[10] + " / " + roman[9])) {System.out.println(roman[1]);}
    if (q.equals(roman[10] + " / " + roman[10])) {System.out.println(roman[1]);}


    else {


    String[] e = q.split(" ");                                // делим строчку по пробелам

        a = e[0];                                                  // число до первого пробела
        b = e[2];                                                  // число после второго пробела
        num1 = Integer.parseInt(String.valueOf(a));                // перевод в инт
        num2 = Integer.parseInt(String.valueOf(b));
        if (num1>0 && num2 >0 && num1<11 && num2<11) {             // числа должны быть от 1 до 10 включительно

            j = e[1];                                              // сканируем символ в строке и придаем арифм.знак
            if (j.contains("+"))            {operation = '+';}
            if (j.contains("-"))            {operation = '-';}
            if (j.contains("*"))            {operation = '*';}
            if (j.contains("/"))            {operation = '/';}

            result = calc(num1, num2, operation);
            System.out.println("Ваш ответ - " + result + ", Господин"); }

        else {System.out.println("SORRY, I CAN'T SCAN IT");        // <---- выводит, если число не вписывается в 1-10
                   }}}

    public static int calc (int num1, int num2, char op) {

        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
        }
        return result; }}









