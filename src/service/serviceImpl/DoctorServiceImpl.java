package service.serviceImpl;

import dao.DepartmentDao;
import dao.DoctorDao;
import dao.daoImpl.DepartmentDaoImpl;
import dao.daoImpl.DoctorDaoImpl;
import models.Doctor;
import service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    DoctorDao doctorDao = new DoctorDaoImpl();
    @Override
    public Doctor getByIdDoctor(Long id) {
        return doctorDao.getByIdDoctor(id);
    }
}
