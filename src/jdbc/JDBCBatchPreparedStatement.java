package jdbc;

import java.sql.*;
import java.io.*;

/**
 * Created by mrahbari on 06/14/2015.
 */
public class JDBCBatchPreparedStatement {
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

            PreparedStatement ps=conn.prepareStatement("INSERT INTO tbl_test (id, title, description, create_time) VALUES (NULL, ?,?, UNIX_TIMESTAMP());");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true){

                /*System.out.println("enter id");
                String s1=br.readLine();
                int id=Integer.parseInt(s1);*/

                System.out.println("enter title: ");
                String title=br.readLine();

                System.out.println("enter description: ");
                String description=br.readLine();

                ps.setString(1, title);
                ps.setString(2,description);

                ps.addBatch();
                System.out.println("Want to add more records y/n");
                String ans=br.readLine();
                if(ans.equals("n")){
                    break;
                }
            }
            ps.executeBatch();
            System.out.println("record successfully saved");

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
