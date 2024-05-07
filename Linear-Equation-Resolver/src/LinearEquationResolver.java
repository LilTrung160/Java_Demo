import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a question as 'a * x + b = c'");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the c: ");
        double c = sc.nextDouble();
        if (a != 0){
            double answer  = (c - b) / a;
            System.out.printf("Equation pass with x = %f\n ", answer);
        }else{
            if (b == c) {
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution found!");
            }
        }
    }
}
