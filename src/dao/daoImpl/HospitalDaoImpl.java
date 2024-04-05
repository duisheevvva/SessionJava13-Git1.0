package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;

public class HospitalDaoImpl  implements HospitalDao {
    @Override
    public Hospital addHospital(Hospital hospital) {
        Database.hospitals.add(hospital);
        return hospital;
    }
}
