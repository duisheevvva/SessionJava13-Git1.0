package service.serviceImpl;

import dao.HospitalDao;
import dao.daoImpl.HospitalDaoImpl;
import models.Hospital;
import service.HospitalService;

import java.util.List;

public class HospitalServiceImpl implements HospitalService {
    HospitalDao hospitalDao = new HospitalDaoImpl();
    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalDao.getAllHospitals();
    }


 

    @Override
    public Hospital addHospital(Hospital hospital) {
         return  hospitalDao.addHospital(hospital);

    }
}
