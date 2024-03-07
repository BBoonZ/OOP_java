import java.sql.*;
public class TestConnection {
    public static void main(String[] args) {
        Connection connect = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/3306", "root","123456");
            s = connect.createStatement();
            String sql = "insert into tbl_employee (emp_user,emp_pass,emp_level,emp_salary) values ('Sara','3333','3',34000)";
            int n = s.executeUpdate(sql);
            System.out.println("Done" + n);

        } catch (Exception e) {
            e.printStackTrace();
        } try {
            if (connect != null) {
                s.close();
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
