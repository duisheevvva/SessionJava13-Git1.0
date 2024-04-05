package dao.daoImpl;

import dao.DepartmentDao;
import database.Database;
import models.Department;
import models.Hospital;

import java.util.Scanner;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public String updateDepartmentById(Long Id, Department department) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new Department Name :");
        department.setDepartmentName(scanner.nextLine());
        for (Hospital hospital : Database.hospitals){
            for (Department department1 : hospital.getDepartments()){
                if(department1.getId()==Id){
                    department1.setDepartmentName(department.getDepartmentName());
                    return " Successfully updated department : "+department1;
                }
            }
        }
        return "Failed";
    }
}
