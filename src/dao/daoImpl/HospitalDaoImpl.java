package dao.daoImpl;

import dao.HospitalDao;
import database.Database;
import models.Hospital;

public class HospitalDaoImpl implements HospitalDao {
    @Override
    public Hospital getHospitalById(Long id) {
        for (Hospital hospital : Database.hospitals) {
            if(hospital.getId().equals(id)){
                return hospital;
            }
        }
    return null;
    }
}
