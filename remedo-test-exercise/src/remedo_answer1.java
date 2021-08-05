import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class remedo_answer1 {


    public static void main(String[] args) {
//connection to db
        String url = "mysql.remedoapp.com";
        String user = "remedo";
        String password = "mypass";

        String query = "SELECT * FROM `transactions` WHERE `user_id` = u1";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print(rs.getInt(1));
                System.out.print(": ");
                System.out.println(rs.getString(2));
            }


        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcRetrieve.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
