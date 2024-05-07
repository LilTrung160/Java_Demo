import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight (kg): ");
        double weight = sc.nextDouble();
        System.out.println("Enter Your Height (m): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are Normal");
        }else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are Overweight");
        }else{
            System.out.println("You are Obese");
        }
    }
}
