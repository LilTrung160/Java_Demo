import java.util.Scanner;

public class NumToString {
    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a non-negative integer (up to 3 digits): ");
            int number = scanner.nextInt();
            if (number < 0 || number > 999) {
                System.out.println("Please enter a non-negative integer up to 3 digits.");
                return;
            }
            System.out.println(convertToWords(number));
        }

        private static String convertToWords(int number) {
            if (number == 0) {
                return "zero";
            }
            String words = "";
            if (number < 10) {
                words += units[number];
            } else if (number < 20) {
                words += teens[number - 11];
            } else if (number < 100) {
                words += tens[number / 10];
                if (number % 10 != 0) {
                    words += " " + units[number % 10];
                }
            } else {
                words += units[number / 100] + " hundred";
                if (number % 100 != 0) {
                    words += " and " + convertToWords(number % 100);
                }
            }
            return words;
        }
}
