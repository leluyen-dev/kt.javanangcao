import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        // Thay đổi thông tin kết nối phù hợp với hệ thống của bạn
        String url = "jdbc:sqlserver://localhost:1433;databaseName=iuhSchool;encrypt=true;trustServerCertificate=true";
        String user = "sa"; // Hoặc tài khoản khác
        String password = "sa"; // Mật khẩu SQL Server

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();

            String sql = "SELECT * FROM menus";

            rs = stmt.executeQuery(sql);

            DisplayResult(rs);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void DisplayResult(ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println("id: " + id + ", name: " + name);
        }
    }
}
