import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnect {
    public static void connect() {
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:D://TrainingCourse/JavaBasic/DB/test.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connect DB Success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
