package bookstore.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_livre")
public class Livre implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="C_titre")
    private String titre;
	@Column(name="C_auteur")
    private String auteur;
	@Column(name="C_nbrPages")
    private int nbrPages;
	@Column(name="C_prix")
    private float prix;
	 @Enumerated(EnumType.STRING)
	private GenreLivre genre;
	 @ManyToOne
	    User utilisateur;
	 
	 public Livre(Long id, String titre, String auteur, int nbrPages, float prix, GenreLivre genre, User utilisateur) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.nbrPages = nbrPages;
		this.prix = prix;
		this.genre = genre;
		this.utilisateur = utilisateur;
	}
	public Livre(){
		 
	 }
	public Livre(Long id, String titre, String auteur, int nbrPages, float prix, GenreLivre genre) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.nbrPages = nbrPages;
		this.prix = prix;
		this.genre = genre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getNbrPages() {
		return nbrPages;
	}
	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public GenreLivre getGenre() {
		return genre;
	}
	public void setGenre(GenreLivre genre) {
		this.genre = genre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + nbrPages;
		result = prime * result + Float.floatToIntBits(prix);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		Livre other = (Livre) obj;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (genre != other.genre)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nbrPages != other.nbrPages)
			return false;
		if (Float.floatToIntBits(prix) != Float.floatToIntBits(other.prix))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", nbrPages=" + nbrPages + ", prix="
				+ prix + ", genre=" + genre + "]";
	}
	 
	 
}
