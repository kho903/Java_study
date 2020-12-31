package day06_abstract;

public class Test02 {

	public static void main(String[] args) {
//		Service service = new Service(); 불가능
//		Service service = new OracleServiceImpl();
		Service service = new MySqlServiceImpl();

		service.insert();
		service.delete();
		service.update();

	}

}
