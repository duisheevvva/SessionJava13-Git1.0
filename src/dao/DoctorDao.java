package dao;

import models.Doctor;

public interface DoctorDao {
    String addDoctor(Long hospitalId, Doctor doctor);
}
