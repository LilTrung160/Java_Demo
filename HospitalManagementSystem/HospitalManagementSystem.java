import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final MedicalRecordService medicalRecordService = new MedicalRecordServiceImpl();
    private static final Scanner scanner = new Scanner(System.in);
    private static Object MainApp;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMedicalRecord();
                    break;
                case 2:
                    medicalRecordService.removeMedicalRecord();
                    break;
                case 3:
                    viewAllMedicalRecords();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
        System.out.println("Exiting...");
    }

    private static void viewAllMedicalRecords() {
    }

    private static void displayMenu() {
        System.out.println("====== MENU ======");
        System.out.println("1. Thêm mới bệnh án");
        System.out.println("2. Xóa bệnh án");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. Thoát");
        System.out.print("Chọn: ");
    }

    private static void addMedicalRecord() {
        System.out.println("Nhập thông tin bệnh án mới:");
        try {
            System.out.print("Mã bệnh án (BA-XXX): ");
            String medicalCode = scanner.nextLine();

            System.out.print("Mã bệnh nhân (BN-XXX): ");
            String patientCode = scanner.nextLine();

            System.out.print("Tên bệnh nhân: ");
            String patientName = scanner.nextLine();

            System.out.print("Ngày nhập viện (dd/MM/yyyy): ");
            LocalDate admissionDate = LocalDate.parse(scanner.nextLine());

            System.out.print("Ngày ra viện (dd/MM/yyyy): ");
            LocalDate dischargeDate = LocalDate.parse(scanner.nextLine());

            System.out.print("Lý do nhập viện: ");
            String admissionReason = scanner.nextLine();

            double hospitalFee = 0.0;
            String vipType = null;
            String vipDuration = null;

            System.out.print("Loại bệnh án (T/V): ");
            String recordType = scanner.nextLine().toUpperCase();
            if ("T".equals(recordType)) {
                System.out.print("Phí nằm viện (VNĐ): ");
                hospitalFee = scanner.nextDouble();
            } else if ("V".equals(recordType)) {
                System.out.print("Loại VIP (VIP I, VIP II, VIP III): ");
                vipType = scanner.nextLine().toUpperCase();

                System.out.print("Thời hạn VIP (dd/MM/yyyy): ");
                vipDuration = scanner.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}