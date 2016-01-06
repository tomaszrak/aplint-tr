package mappers;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.alp.pl.entity.Sale;
public class SalaMapper implements RowMapper<Sale>{
public Sale mapRow(ResultSet rs, int rowNum) throws SQLException {
	Sale sale=new Sale();
	sale.setId(rs.getInt("id"));
	sale.setNumer(rs.getInt("numer"));
	sale.setPojemnosc(rs.getInt("pojemnosc"));
	sale.setTyp_id(rs.getInt("typ_id"));
	return sale;
}
}

