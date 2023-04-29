package bookstore.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import bookstore.entities.Reclamation;
import bookstore.entities.StatutReclamation;
import bookstore.entities.TypeReclamation;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long>{
	// REPOSITORY RECLAMATION -MOHAMED BDIOUI-
	//sans JPQL
	@Query(value="SELECT * FROM T_Reclamation r WHERE r.statut_reclamation=:statutReclamation ", nativeQuery = true)
	List<Reclamation> afficherReclamationsSelonStatut(@Param("statutReclamation") StatutReclamation statutReclamation);
	//sans JPQL
     @Query(value="SELECT * FROM T_Reclamation r WHERE r.id=:id ", nativeQuery = true)
	List<Reclamation> afficherReclamationsSelonID(@Param("id") Long id);
   //avec JPQL
     @Query("UPDATE Reclamation r SET r.statutReclamation=:statut WHERE r.id=:id ")
 	Reclamation changerReclamationSelonStatut(@Param("statut") StatutReclamation statut,@Param("id") Long id);
   //sans JPQL
     @Query(value="UPDATE T_Reclamation r SET r.c_date_reclamation=:date,"
     		                                + "r.c_description=:description"
     		                                + "r.type=:type WHERE r.id=:id ", nativeQuery = true)
	Reclamation modifierReclamation(@Param("id") Long id,@Param("date") Date date,@Param("description")String description,@Param("type")TypeReclamation type);
   //sans JPQL
     @Query(value="SELECT count(*) FROM T_Reclamation", nativeQuery = true)
	int nombreReclamations();
}
