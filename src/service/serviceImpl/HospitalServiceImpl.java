package service.serviceImpl;

import dao.HospitalDao;
import dao.daoImpl.HospitalDaoImpl;
import models.Hospital;
import service.HospitalService;

public class HospitalServiceImpl  implements HospitalService {

    HospitalDao hospitalDao = new HospitalDaoImpl();

    @Override
    public Hospital addHospital(Hospital hospital) {
         return  hospitalDao.addHospital(hospital);
    }
}
