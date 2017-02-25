package json;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class test {

	public static void main(String[] args) {
		ConexionABase c = new ConexionABase();
		
		try {
			c.iniciarConexion("jdbc:mysql://192.168.1.2:3306/employees", "omar", "creat96");
			ResultSet r = c.ejecutarQuery("select * from employees");
			EmpleadoModel e = new EmpleadoModel();
			ArrayList<EmpleadoModel> arr = new ArrayList<EmpleadoModel>();
			ObjectMapper mapperObj = new ObjectMapper();
			
			int cont =1;
			
			while (r.next()) {
				e.setEmp_no(r.getInt("emp_no"));
				e.setBirth_date(r.getString("birth_date"));
				e.setFirst_name(r.getString("first_name"));
				e.setLast_name(r.getString("last_name"));
				e.setGender(r.getString("gender"));
				e.setHire_date(r.getString("hire_date"));
				
				String jsonStr = mapperObj.writeValueAsString(e);
				System.out.println(jsonStr);
				
				
				e = new EmpleadoModel();
			}
		} catch (Exception x) {
			x.printStackTrace();
		}
		
		
	}
	
}
