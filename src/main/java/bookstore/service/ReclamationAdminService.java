package bookstore.service;

import java.util.*;
import bookstore.entities.Reclamation;
import bookstore.exception.ReclamationException;

public interface ReclamationAdminService {
	// SERVICE RECLAMATION -MOHAMED BDIOUI-
	 List<Reclamation> ListReclamations();
	 boolean annulerReclamation(Reclamation r) throws ReclamationException;
     boolean validerReclamations(Reclamation r) throws ReclamationException;
     boolean TraiterReclamation(Reclamation r) throws ReclamationException ;
     int NombreReclamations();
     void AfficherReclamations(List<Reclamation> reclamations);
     Set<Reclamation> afficherReclamation(Reclamation r) throws ReclamationException;
     boolean existeReclamation(Reclamation r);
}
