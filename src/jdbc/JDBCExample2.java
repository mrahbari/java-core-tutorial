package jdbc;

import java.sql.*;
import java.io.*;

/**
 * Created by mrahbari on 06/14/2015.
 */
public class JDBCExample2 {
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

            PreparedStatement stmt2 = conn.prepareStatement("INSERT INTO tbl_0registration (id, first, last, age) VALUES (?, ?, ?, ?);");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            do{
                System.out.println("enter id:");
                int id=Integer.parseInt(br.readLine());
                System.out.println("enter name:");
                String name=br.readLine();
                System.out.println("enter family:");
                String family=br.readLine();
                System.out.println("enter age:");
                float age=Float.parseFloat(br.readLine());

                stmt2.setInt(1,id);
                stmt2.setString(2,name);
                stmt2.setString(3,family);
                stmt2.setFloat(4,age);
                int i=stmt2.executeUpdate();
                System.out.println(i+" records affected");

                System.out.println("Do you want to continue: y/n");
                String s=br.readLine();
                if(s.startsWith("n")){
                    break;
                }
            }while(true);

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
