package Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectDB {
	private static String driveClass="com.mysql.jdbc.Driver:";
	public static final String URL = "jdbc:mysql://localhost:3306/phongban";
    public static final String USER = "root";
    public static final String PASS = "12345";
    private static Connection conn=null;
    public static Connection getConnection() {
    	try {
			Class.forName(driveClass);
			conn=DriverManager.getConnection(URL,USER,PASS);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
    }
}
