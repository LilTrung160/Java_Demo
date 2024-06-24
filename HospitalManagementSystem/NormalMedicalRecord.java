import java.time.LocalDate;

public class NormalMedicalRecord extends MedicalRecord {
    private int hospitalFee;

    public NormalMedicalRecord(int id, String medicalCode, String patientCode, String patientName, LocalDate admissionDate, LocalDate dischargeDate, String admissionReason, double hospitalFee, String vipType, String vipDuration) {
        super(id, medicalCode, patientCode, patientName, admissionDate, dischargeDate, admissionReason, hospitalFee, vipType, vipDuration);
    }

    public int getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(int hospitalFee) {
        this.hospitalFee = hospitalFee;
    }
}
