package jdbc;

import java.sql.*;

/**
 * Created by mrahbari on 06/14/2015.
 */
public class JDBCExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbookcom_db?useUnicode=true&characterEncoding=utf-8";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();

            /*String sql1 = "DROP TABLE IF EXISTS tbl_0registration;";// +
            stmt.executeUpdate(sql1);*/

            String sql2 = "CREATE TABLE IF NOT EXISTS tbl_0registration " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age FLOAT , " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql2);
            System.out.println("Created table in given database...");

            //////////////////////////////////////////////////////////
            // NamedParameterStatement
            String query="select * from tbl_0registration where first=:first or last=:last";
            NamedParameterStatement p=new NamedParameterStatement(conn, query);
            p.setString("first", "mojtaba");
            p.setString("last", "%%");
            ResultSet rs=p.executeQuery();

            System.out.println("the result of named parameter statement is:");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            System.out.println();
            //////////////////////////////////////////////////////////


        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}
