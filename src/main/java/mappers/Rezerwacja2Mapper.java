package mappers;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pl.alp.pl.entity.Rezerwacja2;
public class Rezerwacja2Mapper implements RowMapper<Rezerwacja2> {
	   public Rezerwacja2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Rezerwacja2 rez=new Rezerwacja2();
		   rez.setId(rs.getInt("r.id"));
		   rez.setCel(rs.getString("r.cel"));
		   rez.setDataroz(rs.getTime("r.data_roz"));
		   rez.setDatazak(rs.getTime("r.data_zak"));
		   rez.setData(rs.getDate("r.data"));
		   rez.setSala(rs.getInt("s.numer"));
		   rez.setNazwisko(rs.getString("p.nazwisko"));
		   rez.setImie(rs.getString("p.imie"));
		   return rez;
	   }

}
