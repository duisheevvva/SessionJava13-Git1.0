package service;

import models.Hospital;


import java.util.List;

public interface HospitalService {
    List<Hospital> getAllHospitals ();

    Hospital addHospital(Hospital hospital);

}
