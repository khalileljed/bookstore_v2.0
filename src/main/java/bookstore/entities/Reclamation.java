package bookstore.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_Reclamation")
public class Reclamation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	@Enumerated(EnumType.STRING)
	 private TypeReclamation type;
	@Enumerated(EnumType.STRING)
	 private StatutReclamation statutReclamation;
	@Column(name="C_dateReclamation")
	@Temporal(TemporalType.DATE)
	 private Date DateReclamation;
	@Column(name="C_Description")
	 private String Description;
	@Column(name="C_ClientUsername")
	 private String ClientUsername;
	@ManyToOne
    User utilisateur;
	
	public Reclamation(Long id, TypeReclamation type, StatutReclamation statutReclamation, Date dateReclamation,
			String description, String clientUsername, User utilisateur) {
		super();
		this.id = id;
		this.type = type;
		this.statutReclamation = statutReclamation;
		DateReclamation = dateReclamation;
		Description = description;
		ClientUsername = clientUsername;
		this.utilisateur = utilisateur;
	}
	public Reclamation() {
	}
	public Reclamation(Long id, TypeReclamation type, StatutReclamation statutReclamation, Date dateReclamation, String description,
			String clientUsername) {
		super();
		this.id = id;
		this.type=type;
		this.statutReclamation = statutReclamation;
		this.DateReclamation = dateReclamation;
		this.Description = description;
		this.ClientUsername = clientUsername;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeReclamation getType() {
		return type;
	}
	public void setType(TypeReclamation type) {
		this.type = type;
	}
	public StatutReclamation getStatutReclamation() {
		return statutReclamation;
	}
	public void setStatutReclamation(StatutReclamation statutReclamation) {
		this.statutReclamation = statutReclamation;
	}
	public Date getDateReclamation() {
		return DateReclamation;
	}
	public void setDateReclamation(Date dateReclamation) {
		DateReclamation = dateReclamation;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getClientUsername() {
		return ClientUsername;
	}
	public void setClientUsername(String clientUsername) {
		ClientUsername = clientUsername;
	}
   
}
