package bookstore.service;

import java.util.Date;

import bookstore.entities.Reclamation;
import bookstore.entities.TypeReclamation;
import bookstore.exception.ReclamationException;

public interface ReclamationClientService {
	// SERVICE RECLAMATION -MOHAMED BDIOUI-
	 void envoyerReclamation(Reclamation r) throws ReclamationException;
     void modifierReclamation(Reclamation r,Date date,String description,TypeReclamation type) throws ReclamationException ;
     void annulerReclamationsClient(Reclamation r) throws ReclamationException;
     boolean existeReclamation(Reclamation r);
}
