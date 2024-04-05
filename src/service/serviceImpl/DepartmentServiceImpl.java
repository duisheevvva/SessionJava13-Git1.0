package service.serviceImpl;

import dao.daoImpl.DepartmentDaoImpl;
import models.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
    @Override
    public String updateDepartmentById(Long Id, Department department) {
        return departmentDao.updateDepartmentById(Id,department);
    }
}
