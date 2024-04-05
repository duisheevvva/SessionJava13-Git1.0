package service.serviceImpl;

import dao.DepartmentDao;
import dao.daoImpl.DepartmentDaoImpl;
import models.Department;
import service.DepartmentService;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDao dao = new DepartmentDaoImpl();
    @Override
    public List<Department> getAllDEaprtment() {
        return dao.getAllDEaprtment();
    }

    @Override
    public String deleteDepartmentIdByHospitalId(Long hospitalId, Long departmentId) {
        return dao.deleteDepartmentIdByHospitalId(hospitalId, departmentId);
    }
}
