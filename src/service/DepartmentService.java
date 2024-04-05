package service;

import models.Department;

public interface DepartmentService {
    String addDepartmentToHospital(Long hosId, Department department);
}
