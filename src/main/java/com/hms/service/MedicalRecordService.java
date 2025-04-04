package com.hms.service;

import com.hms.model.MedicalRecord;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordService {
    private List<MedicalRecord> records = new ArrayList<>();

    public void addRecord(MedicalRecord record) {
        records.add(record);
    }

    public List<MedicalRecord> getAll() {
        return records;
    }
}
