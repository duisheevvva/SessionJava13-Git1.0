package service;

import models.Doctor;

public interface DoctorService {
    String addDoctor(Long hospitalId, Doctor doctor);
}
