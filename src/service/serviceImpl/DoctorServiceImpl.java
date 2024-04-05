package service.serviceImpl;

import dao.DoctorDao;
import dao.daoImpl.DoctorDaoImpl;
import models.Doctor;
import service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    DoctorDao doctorDao = new DoctorDaoImpl();
    @Override
    public String addDoctor(Long hospitalId, Doctor doctor) {
        return doctorDao.addDoctor(hospitalId, doctor);
    }
}
