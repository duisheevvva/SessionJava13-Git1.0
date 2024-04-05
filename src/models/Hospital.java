package models;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private Long id;
    private String hospitalName;
    private List<Department>departments = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public Hospital(Long id, String hospitalName, List<Department> departments, List<Doctor> doctors) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.departments = departments;
        this.doctors = doctors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                ", doctors=" + doctors +
                '}';
    }
}
