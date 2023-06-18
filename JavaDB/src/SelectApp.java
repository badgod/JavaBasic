import java.sql.*;

public class SelectApp {
    public Connection connect() {
        String url = "jdbc:sqlite:D://TrainingCourse/JavaBasic/DB/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {
        String sql = "SELECT * FROM warehouse";

        try (Connection conn = this.connect()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String name, double capacity){
        String sql = "INSERT INTO warehouse (name, capacity) VALUES (?, ?)";
        try (Connection conn = this.connect()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setDouble(2, capacity);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int id, String name, double capacity){
        String sql = "UPDATE warehouse SET name = ?, capacity = ? WHERE id = ?";
        try (Connection conn = this.connect()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setDouble(2, capacity);
            stmt.setInt(3, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int id){
        String sql = "DELETE FROM warehouse WHERE id = ?";
        try (Connection conn = this.connect()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        //app.insert("Supod", 4000.90);
        //app.update(13, "Wongsri", 5000.87);
        //app.delete(12);
        app.selectAll();
    }
}
