package dao;

import models.Hospital;

public interface HospitalDao {
    String updateHospital(Hospital hospital, Hospital newHospital);
}
