package jdbc;

import java.sql.*;
import java.io.*;

public class JDBCORACLE {
    /*
    // MYSQL
    // JDBC driver name and database URL
    static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbookcom_db?useUnicode=true&characterEncoding=utf-8";

    //  Database credentials
    static final String DB_USER = "root";
    static final String DB_PASS = "";*/

    // ORACLE
    // JDBC driver name and database URL
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@172.16.78.200:1631:pnatest";

    //  Database credentials
    private static final String DB_USER = "test_2";
    private static final String DB_PASS = "test_2";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DB_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connected database successfully...");

            // Execute SQL query
            stmt = conn.createStatement();

            /*String sql2 = "INSERT INTO tbl_customers (id, first_name, last_name, course) VALUES (1, 'Mojtaba', 'Rahbari', 'C1')";
            String sql3 = "INSERT INTO tbl_customers (id, first_name, last_name, course) VALUES (2, 'Reza', 'Omrani', 'C2')";
            String sql4 = "INSERT INTO tbl_customers (id, first_name, last_name, course) VALUES (3, 'Kazem', 'Alikhani', 'C3')";
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql4);
            System.out.println("Data was inserted...");*/

            String sql = "select * from tbl_customers";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String course = rs.getString("course");

                //Display values
                System.out.println("ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Course: " + course);
                System.out.println();
            }

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
