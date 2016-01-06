package template;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import mappers.SalaMapper;
import pl.alp.pl.entity.Rezerwacja;
import pl.alp.pl.entity.Sale;
import pl.alp.pl.entity.Rezerwacja2;
import mappers.RezerwacjeMapper;
import mappers.Rezerwacja2Mapper;

public class RezerwacjeJDBCTemplate {
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   public  List<Rezerwacja> listRezerwacje(int id) {
		   String SQL = ("select r.id, r.data, r.data_zak,r.data_roz,r.cel, s.numer from rezerwacja r  inner join sala s on s.id=r.Sala_id where Prowadzacy_id="+id);
		     // String SQL = ("select * from rezerwacja where Prowadzacy_id="+id);
		   //select r.data, r.data_zak, s.numer from rezerwacja.rezerwacja r  inner join rezerwacja.sala s on s.id=r.Sala_id
		      List <Rezerwacja> prod = jdbcTemplateObject.query(SQL, 
		                                new RezerwacjeMapper());
		      return prod;
		   }
	   
	  // INSERT INTO `rezerwacja`.`rezerwacja` (`data_roz`, `data_zak`, `cel`, `Prowadzacy_id`, `Sala_id`, `data`) VALUES ('12:00:00', '17:00:00', 'zajêcia pedagogiczne', '3', '2', '2016-10-16');
	   public void createrez (java.sql.Date data,java.sql.Time data_roz,java.sql.Time data_zak,int idpr,int idsal,String cel) {
		      String SQL = "insert into rezerwacja (`data_roz`, `data_zak`, `cel`, `Prowadzacy_id`, `Sala_id`, `data`) VALUES (?,?,?,?,?,?)";
		      
		      jdbcTemplateObject.update( SQL,data_roz,data_zak,cel,idpr,idsal,data);
		    
		      return;
		   }
	   
	   //SELECT id FROM rezerwacja.sala where numer=233;
	   public  Sale findid(int numer){
		   
		   String SQL ="SELECT * FROM sala where numer="+numer;
		   Sale ee= jdbcTemplateObject.queryForObject(SQL, new SalaMapper());;
		   
		   return ee;
	   }
	   
	   public  List<Rezerwacja2> listRezerwacjewysz() {
		   String SQL = ("select p.imie,p.nazwisko, s.numer,r.id, r.data, r.data_zak,r.data_roz,r.cel  from rezerwacja.rezerwacja r  inner join rezerwacja.sala s on s.id=r.Sala_id inner join rezerwacja.prowadzacy p on p.id=r.Prowadzacy_id ");
		     
		      List <Rezerwacja2> prod = jdbcTemplateObject.query(SQL, 
		                                new Rezerwacja2Mapper());
		      return prod;
		   }
	   
	   //int id,java.sql.Date data
	   public  List<Rezerwacja2> listRezerwacjewysz2(int id,java.sql.Date data) {
		   String SQL = ("select p.imie,p.nazwisko, s.numer,r.id, r.data, r.data_zak,r.data_roz,r.cel  from rezerwacja.rezerwacja r  inner join rezerwacja.sala s on s.id=r.Sala_id inner join rezerwacja.prowadzacy p on p.id=r.Prowadzacy_id where s.id="+id+" and r.data='"+data+"'");
		     
		      List <Rezerwacja2> prod = jdbcTemplateObject.query(SQL, 
		                                new Rezerwacja2Mapper());
		      return prod;
		   }
	   
}
