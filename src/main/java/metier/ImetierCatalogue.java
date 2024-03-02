package metier;

import java.util.List;

public interface ImetierCatalogue {

	public List<Chaussure> getChaussuresParMotCle(String mc);
	public void addProduit(Chaussure c);
}
