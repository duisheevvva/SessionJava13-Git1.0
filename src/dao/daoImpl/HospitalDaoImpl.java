package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;

public class HospitalDaoImpl implements HospitalDao {
    @Override
    public String updateHospital(Hospital hospital, Hospital newHospital) {
        hospital.setHospitalName(newHospital.getHospitalName());
        return "The update has been completed successfully";
    }
}
