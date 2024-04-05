package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;


import java.util.List;

public class HospitalDaoImpl implements HospitalDao {
    @Override
    public List<Hospital> getAllHospitals() {
        return Database.hospitals;
    }

    @Override
    public Hospital addHospital(Hospital hospital) {
        Database.hospitals.add(hospital);
        return hospital;

    }
}
