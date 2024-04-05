package service;

import models.Hospital;
import java.util.List;


public interface HospitalService {
    Hospital getHospitalById(Long id);


    List<Hospital> getAllHospitals ();

    Hospital addHospital(Hospital hospital);

}
