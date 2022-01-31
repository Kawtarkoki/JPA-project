package fr.eilco.JPA_project.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;//Génerer les getters et setters sans les afficher en code source
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "PATIENTS")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name = "NOM",length = 25)
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date datNaissance;
	private int score;
	private boolean malade;

	
	
}
