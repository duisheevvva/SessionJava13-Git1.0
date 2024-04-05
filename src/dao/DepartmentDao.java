package dao;

import models.Department;

import java.util.List;

public interface DepartmentDao{
    List<Department> getAllDEaprtment();
    String deleteDepartmentIdByHospitalId(Long hospitalId,Long departmentId);
}
