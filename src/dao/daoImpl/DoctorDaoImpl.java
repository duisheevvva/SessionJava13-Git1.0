package dao.daoImpl;

import dao.DoctorDao;
import database.Database;
import models.Doctor;
import models.Hospital;

import java.util.List;

public class DoctorDaoImpl implements DoctorDao {
    @Override
    public Doctor getByIdDoctor(Long id) {
        for (Hospital hospital : Database.hospitals) {
            for (Doctor hospitalDoctor : hospital.getDoctors()) {
                if (hospitalDoctor.getId().equals(id)){
                    return hospitalDoctor;
                }
            }
        }
        return null;
    }
}
