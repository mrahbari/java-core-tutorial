package jdbc;

import java.sql.*;
import java.io.*;

/**
 * Created by mrahbari on 06/14/2015.
 * <p>
 * It follows following steps:
 * Load the driver class
 * Create Connection
 * Create Statement
 * Add query in the batch
 * Execute Batch
 * Close Connection
 */
public class JDBCFile {
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

            // Example to store file in Oracle database
            /*PreparedStatement ps = conn.prepareStatement("insert into tbl_file_image values(?,?,?)");
            ps.setInt(1, 2);

            File f = new File("D:\\Htaccess2.docx");
            FileReader fr = new FileReader(f);

            ps.setCharacterStream(2, fr, (int) f.length());
            ps.setString(3, "Htaccess File");

            int i = ps.executeUpdate();
            System.out.println(i + " records affected");*/


            PreparedStatement ps = conn.prepareStatement("select * from tbl_file_image where id=2");
            ResultSet rsf = ps.executeQuery();

            rsf.next();
            Clob c = rsf.getClob(2);
            Reader r = c.getCharacterStream();
            FileWriter fw = new FileWriter("d:\\retrieve.docx");

            int i;
            while ((i = r.read()) != -1) {
                fw.write((char) i);
            }

            fw.close();
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
