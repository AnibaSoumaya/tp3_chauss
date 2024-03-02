package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Chaussure> getChaussuresParMotCle(String mc) {
List<Chaussure> prods= new ArrayList<Chaussure>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from CHAUSSURES where NOM_CHAUSS LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	Chaussure p = new Chaussure();
p.setIdChaussure(rs.getLong("ID_CHAUSS"));
p.setNomChaussure(rs.getString("NOM_CHAUSS"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addProduit(Chaussure c) {
// TODO Auto-generated method stub
}
}
