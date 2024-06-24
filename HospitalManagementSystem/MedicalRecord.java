import java.time.LocalDate;

public class MedicalRecord {
    private int id;
    private String medicalCode;
    private String patientCode;
    private String patientName;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String admissionReason;
    private double hospitalFee;
    private String vipType;
    private String vipDuration;

    public MedicalRecord(int id, String medicalCode, String patientCode, String patientName, LocalDate admissionDate, LocalDate dischargeDate, String admissionReason, double hospitalFee, String vipType, String vipDuration) {
        this.id = id;
        this.medicalCode = medicalCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.admissionReason = admissionReason;
        this.hospitalFee = hospitalFee;
        this.vipType = vipType;
        this.vipDuration = vipDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalCode() {
        return medicalCode;
    }

    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getAdmissionReason() {
        return admissionReason;
    }

    public void setAdmissionReason(String admissionReason) {
        this.admissionReason = admissionReason;
    }

    public int getHospitalFee() {
        return (int) hospitalFee;
    }

    public void setHospitalFee(double hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipDuration() {
        return vipDuration;
    }

    public void setVipDuration(String vipDuration) {
        this.vipDuration = vipDuration;
    }
}
