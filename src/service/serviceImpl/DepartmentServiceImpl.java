package service.serviceImpl;

import dao.DepartmentDao;
import dao.daoImpl.DepartmentDaoImpl;
import models.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDao departmentDao = new DepartmentDaoImpl();
    @Override
    public Department getDepartmentById(Long id) {
        return departmentDao.getDepartmentById(id);
    }
}
