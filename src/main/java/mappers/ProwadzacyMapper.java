package mappers;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import pl.alp.pl.entity.Prowadzacy;

public class ProwadzacyMapper implements RowMapper<Prowadzacy> {
   public Prowadzacy mapRow(ResultSet rs, int rowNum) throws SQLException {
      Prowadzacy prowa = new Prowadzacy();
      prowa.setId(rs.getInt("id"));
      prowa.setPassword(rs.getString("password"));
      prowa.setImie(rs.getString("imie"));
      prowa.setNazwisko(rs.getString("nazwisko"));
      prowa.setTelefon(rs.getString("telefon"));
      prowa.setAdmin(rs.getInt("admin"));
      return prowa;
   }
}


