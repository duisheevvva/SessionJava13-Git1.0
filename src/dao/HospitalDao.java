package dao;
import java.util.List;

import models.Hospital;


public interface HospitalDao {
    Hospital getHospitalById(Long id);

    List<Hospital> getAllHospitals ();

    Hospital addHospital(Hospital hospital);


}
