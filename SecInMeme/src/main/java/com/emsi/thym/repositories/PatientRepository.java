package com.emsi.thym.repositories;

import com.emsi.thym.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
     Page<Patient> findByNomContains(Pageable pageable,String k);
}
