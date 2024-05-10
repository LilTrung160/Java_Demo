import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 25000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to convert: ");
        usd = sc.nextDouble();
        double converted = usd * vnd;
        System.out.println("Converted usd: " + converted);
    }
}
