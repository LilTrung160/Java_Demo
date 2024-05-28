import java.util.Scanner;

public class DrawGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        int width = 4, height = 7;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle top-left");
            System.out.println("3. Draw the square triangle top-right");
            System.out.println("4. Draw the square triangle bottom-left");
            System.out.println("5. Draw the square triangle bottom-right");
            System.out.println("6. Draw the square isosceles triangle");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j < height; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 7; i >= 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3: //Draw the square triangle top-right
                    for (int i = 0; i < height; i++) {
                        // Vòng lặp trong để in các khoảng trắng
                        for (int j = 0; j < i; j++) {
                            System.out.print(' ');
                        }
                        // Vòng lặp trong để in các ký tự '*'
                        for (int j = i; j < height; j++) {
                            System.out.print('*');
                        }
                        // Xuống dòng sau mỗi dòng của tam giác
                        System.out.println();
                    }
                    break;
                case 4: //Draw the square triangle bottom-left
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 5:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i - 1; j++) {
                            System.out.print(' ');
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i - 1; j++) {
                            System.out.print(' ');
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
