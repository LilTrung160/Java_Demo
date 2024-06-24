import java.time.LocalDate;

public class VIPMedicalRecord extends MedicalRecord {
    private String vipType;
    private LocalDate vipDeadline;

    public VIPMedicalRecord(int id, String medicalCode, String patientCode, String patientName, LocalDate admissionDate, LocalDate dischargeDate, String admissionReason, double hospitalFee, String vipType, String vipDuration) {
        super(id, medicalCode, patientCode, patientName, admissionDate, dischargeDate, admissionReason, hospitalFee, vipType, vipDuration);
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public LocalDate getVipDeadline() {
        return vipDeadline;
    }

    public void setVipDeadline(LocalDate vipDeadline) {
        this.vipDeadline = vipDeadline;
    }
}
