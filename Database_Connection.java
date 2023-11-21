package JDBC;

import java.sql.*;

public class Database_Connection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "jaatshaB12#_");
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT* FROM Student_Mohit22csu255	");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " +  rs.getString(4));
           
                con.close();
             }



        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}