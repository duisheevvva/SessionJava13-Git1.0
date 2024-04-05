package dao;

import models.Department;

public interface DepartmentDao {
    String addDepartmentToHospital(Long hosId, Department department);

}
