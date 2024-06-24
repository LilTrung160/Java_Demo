import java.util.List;

public interface MedicalRecordService {
    void addMedicalRecord(MedicalRecord record) throws DuplicateMedicalRecordException;
    void removeMedicalRecord(String medicalCode);
    List<MedicalRecord> getAllMedicalRecords();

    void removeMedicalRecord();
}
