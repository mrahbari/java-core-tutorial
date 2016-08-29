package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 * Created by mrahbari on 06/14/2015.
 *
 */
public class JDBCRowSet {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbookcom_db?useUnicode=true&characterEncoding=utf-8";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws Exception{

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl(DB_URL);
        rowSet.setUsername(USER);
        rowSet.setPassword(PASS);

        rowSet.setCommand("select * from tbl_test");
        rowSet.execute();
        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("\n");
            System.out.println("Id: " + rowSet.getString(1));
            System.out.println("Title: " + rowSet.getString(2));
            System.out.println("Description: " + rowSet.getString(3));
            System.out.println("Date: " + rowSet.getString(4));
        }

        System.out.println("Goodbye!");
    }//end main
}
