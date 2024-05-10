import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of months: ");
        int months = sc.nextInt();
        //Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        double interestTotal = 0;
        for (int i = 0; i < months; i++){
            interestTotal += amount * (rate/100) / 12 * months;
        }
        System.out.print("Total of interest: " + interestTotal);
    }
}
