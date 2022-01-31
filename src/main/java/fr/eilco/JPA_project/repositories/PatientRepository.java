package fr.eilco.JPA_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eilco.JPA_project.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient,Long>{

	
}
