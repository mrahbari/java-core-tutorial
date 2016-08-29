package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Created by mrahbari on 06/13/2015.
 */
public class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbookcom_db", "root", "");

           //here dbookcom_db is database name, root is username and password is empty
            Statement stmt = con.createStatement();

             ResultSet rs = stmt.executeQuery("select * from tbl_menu");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(11));

            //getting the record of 3rd row
            System.out.println("\n\n");
            rs.absolute(3);
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

            System.out.println("\n\n");
            int result = stmt.executeUpdate("delete from tbl_1new_member where id >=100 and id<=201");
            if (result>0)
                System.out.println(result + " record was deleted successfully!");

            // Example of PreparedStatement interface that inserts the record
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
