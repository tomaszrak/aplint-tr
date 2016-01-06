package mappers;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.alp.pl.entity.Rezerwacja;
public class RezerwacjeMapper implements RowMapper<Rezerwacja> {
	   public Rezerwacja mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Rezerwacja rez=new Rezerwacja();
		   rez.setId(rs.getInt("r.id"));
		   rez.setCel(rs.getString("r.cel"));
		   rez.setDataroz(rs.getTime("r.data_roz"));
		   rez.setDatazak(rs.getTime("r.data_zak"));
		   rez.setData(rs.getDate("r.data"));
		   rez.setSala(rs.getInt("s.numer"));
		   return rez;
	   }

}






