package fr.eilco.JPA_project;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.eilco.JPA_project.entities.Patient;
import fr.eilco.JPA_project.repositories.PatientRepository;

@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner{

	// déclarer les objets ici 
	@Autowired
	private PatientRepository patientRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Insertion des patients dans ma base de donnée 
		patientRepository.save(new Patient(null,"kawtar",new Date() ,2300,false)); // il faut respecter l'ordre des attributs de la classe Patient
		//patientRepository.save(new Patient(null,"houda",new Date() ,2300,false));	
		//patientRepository.save(new Patient(null,"nada",new Date() ,2300,true));
		//afficher pour chaque patient p ja vais afficher ses infos 
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		
		
		
		
	}

}
