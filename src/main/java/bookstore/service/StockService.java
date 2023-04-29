package bookstore.service;

import java.util.List;
import java.util.function.Consumer;

import bookstore.entities.Livre;
import bookstore.exception.StockException;

public interface StockService {
	// SERVICE STOCK -MOHAMED BDIOUI-
	boolean existeLivre(Livre l);
    int QuantiteLivre (Livre l) throws StockException;
    int QuantiteLivres();
    void passerCommandeLivre(Livre l)throws Exception;
    List<Livre>  ListerLivres();
    List<Livre>  afficherLivre(Livre l) throws StockException;
    void AfficherLivres(List<Livre> livres);
}
