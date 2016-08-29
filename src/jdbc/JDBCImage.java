package jdbc;

import java.sql.*;
import java.io.*;

/**
 * Created by mrahbari on 06/14/2015.
 */
public class JDBCImage {
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
            DatabaseMetaData dbmd = conn.getMetaData();

            /*
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

            String table[] = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, table);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }*/

            // Example to store image in Oracle database
            /*PreparedStatement ps=conn.prepareStatement("insert into tbl_file_image values(?,?,?)");
            ps.setInt(1,1);

            FileInputStream fin=new FileInputStream("D:\\Photography\\Photo Sample\\Photo Sample3\\brasai\\brassai_palais_royale_station.jpg");
            ps.setBinaryStream(2,fin,fin.available());

            ps.setString(3,"Brassai Palais Royale Station");

            int i=ps.executeUpdate();
            System.out.println(i+" records affected");*/

            // Example to retrieve image from Oracle database
            PreparedStatement ps1 = conn.prepareStatement("select * from tbl_file_image");
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()){
                Blob name = rs1.getBlob(2);
                byte bl1[] = name.getBytes(1, (int) name.length());
                FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");
                fout.write(bl1);

                String description = rs1.getString(3);

                fout.close();
            }


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
