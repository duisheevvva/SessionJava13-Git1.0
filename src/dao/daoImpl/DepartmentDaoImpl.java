package dao.daoImpl;

import dao.DepartmentDao;
import database.Database;
import models.Department;
import models.Hospital;

import javax.xml.crypto.Data;

public class DepartmentDaoImpl implements DepartmentDao {

    @Override
    public Department getDepartmentById(Long id) {
        for (Hospital hospital : Database.hospitals) {
            for (Department hospitalDepartment : hospital.getDepartments()) {
                if (hospitalDepartment.getId().equals(id)) {
                    return hospitalDepartment;
                }
            }
        }
        return null;
    }
}
