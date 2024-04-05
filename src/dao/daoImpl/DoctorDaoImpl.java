package dao.daoImpl;

import dao.DoctorDao;
import database.Database;
import exception.StackOverflowException;
import models.Doctor;

public class DoctorDaoImpl implements DoctorDao {
    @Override
    public String addDoctor(Long hospitalId, Doctor doctor) {
        try {
            Database.hospitals.stream()
                    .filter(x -> x.getId().equals(hospitalId))
                    .findFirst()
                    .orElseThrow(() -> new StackOverflowException("Больница с указанным id не найден!"))
                    .getDoctors().add(doctor);
            return "Доктор успешно добавлен!";
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}
