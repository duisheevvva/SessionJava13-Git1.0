package dao.daoImpl;

import dao.DepartmentDao;
import database.Database;
import models.Department;
import models.Hospital;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> getAllDEaprtment() {
        for (Hospital hospital : Database.hospitals) {
            return hospital.getDepartments();
        }
        return null;
    }

    @Override
    public String deleteDepartmentIdByHospitalId(Long hospitalId, Long departmentId) {
        for (Hospital hospital : Database.hospitals) {
            if (hospital.getId().equals(hospitalId)){
                for (Department department :hospital.getDepartments()){
                    if (department.getId().equals(departmentId)){
                        hospital.getDepartments().remove(department);
                        return "Success deleted!";
                    }
                }
            }
        }
        return "Not-Found!";
    }
}
