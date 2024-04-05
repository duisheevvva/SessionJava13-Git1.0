package dao.daoImpl;

import dao.DepartmentDao;
import database.Database;
import models.Department;
import models.Hospital;

public class DepartmentDaoImpl implements DepartmentDao {

    @Override
    public String addDepartmentToHospital(Long hosId, Department department) {
        for (Hospital hospital : Database.hospitals) {
            if (hospital.getId().equals(hosId)){
                hospital.getDepartments().add(department);
                return department.getDepartmentName()+" successfully added to hospital by id :"+hosId;
            }
        }
        throw new RuntimeException("hospital by id "+hosId+" not found!");
    }

}
