package template;
// zawiera funkcje kt�re mo�na wywo�a� dla tabeli prowadz�cy
//daje dost�p do bazy danych
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import pl.alp.pl.entity.Prowadzacy;
//import pl.alp.pl.service.ProwadzacyDAO;
import mappers.ProwadzacyMapper;


public class ProwadzacyJDBCTemplate  {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }

   public void create(String imie,String nazwisko,String password) {
      String SQL = "insert into Prowadzacy (imie,nazwisko,password) values (?,?,?)";
      
      jdbcTemplateObject.update( SQL,imie,nazwisko,password);
    
      return;
   }

//   public Prowadzacy getProwadzacy(Integer id) {
//      String SQL = "select * from Prowadzacy where id = ?";
//      Prowadzacy student = jdbcTemplateObject.queryForObject(SQL, 
//                        new Object[]{id}, new ProwadzacyMapper());
//      return student;
//   }

   public  List<Prowadzacy> listProwadzacy() {
      String SQL = "select * from Prowadzacy";
      List <Prowadzacy> prod = jdbcTemplateObject.query(SQL, 
                                new ProwadzacyMapper());
      return prod;
   }

public Prowadzacy znajdzid(int id) {
	Prowadzacy user=jdbcTemplateObject.queryForObject("select * from Prowadzacy where id="+id, new ProwadzacyMapper());
	return user;
}

//   public void delete(Integer id){
//      String SQL = "delete from Prowadzacy where id = ?";
//      jdbcTemplateObject.update(SQL, id);
//      System.out.println("Deleted Record with ID = " + id );
//      return;
//   }
//
//   public void update(Integer id, Integer age){
//      String SQL = "update Prowadzacy set age = ? where id = ?";
//      jdbcTemplateObject.update(SQL, age, id);
//      System.out.println("Updated Record with ID = " + id );
//      return;
//   }

}