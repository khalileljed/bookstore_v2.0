package bookstore.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "T_Utilisateur")
public class User  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="C_nom")
    private String nom;
	@Column(name="C_prenom")
    private String prenom;
	@Column(name="C_adresse")
    private String adresse;
	@Column(name="C_username")
    private String username;
	@Column(name="C_telephone")
    private int tel;
	@Column(name="C_password")
    private String password;
	@Column(name="C_salaire")
    private float salaire;
	@Column(name="C_email")
    private String email;
	@Column(name="C_CIN")
    private int CIN;
    @Enumerated(EnumType.STRING)
    private RoleUser role;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="utilisateur")
    private Set<Reclamation> reclamation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="utilisateur")
    private Set<Livre> livre;
    
    public User(Long id, String nom, String prenom, String adresse, String username, int tel, String password,
			float salaire, String email, int cIN, RoleUser role, Set<Reclamation> reclamation, Set<Livre> livre) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.username = username;
		this.tel = tel;
		this.password = password;
		this.salaire = salaire;
		this.email = email;
		CIN = cIN;
		this.role = role;
		this.reclamation = reclamation;
		this.livre = livre;
	}

	public User(){
    	
    }
    
	public User(Long id, String nom, String prenom, String adresse, String username, int tel, float salaire,
			String email, int cIN, RoleUser role,String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.username = username;
		this.tel = tel;
		this.salaire = salaire;
		this.email = email;
		this.CIN = cIN;
		this.role = role;
		this.password=password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public RoleUser getRole() {
		return role;
	}
	public void setRole(RoleUser role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CIN;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + Float.floatToIntBits(salaire);
		result = prime * result + tel;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (CIN != other.CIN)
			return false;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (role != other.role)
			return false;
		if (Float.floatToIntBits(salaire) != Float.floatToIntBits(other.salaire))
			return false;
		if (tel != other.tel)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", username="
				+ username + ", tel=" + tel + ", salaire=" + salaire + ", email=" + email + ", CIN=" + CIN + ", role="
				+ role + "]";
	}
    
    
}
