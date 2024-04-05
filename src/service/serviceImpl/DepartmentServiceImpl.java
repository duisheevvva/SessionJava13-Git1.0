package service.serviceImpl;

import dao.DepartmentDao;
import dao.daoImpl.DepartmentDaoImpl;
import models.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDao departmentDao = new DepartmentDaoImpl();
    @Override
    public String addDepartmentToHospital(Long hosId, Department department) {
        return departmentDao.addDepartmentToHospital(hosId, department);
    }
}
