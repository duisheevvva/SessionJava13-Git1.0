package service;

import models.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDEaprtment();
    String deleteDepartmentIdByHospitalId(Long hospitalId,Long departmentId);
}
