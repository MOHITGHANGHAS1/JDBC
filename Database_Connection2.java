package JDBC;
import java.sql.*;
public class Database_Connection2 {
	public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "jaatshaB12#_");

	            // Create a Statement object for executing SQL queries
	            Statement stat = con.createStatement();

	            // Define the SQL INSERT statement
	            String insertQuery = "INSERT INTO Student_Mohit22csu255 (student_id, student_name, student_course, student_grade) VALUES (?, ?, ?, ?)";

	            // Create a PreparedStatement for the INSERT statement
	            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);

	            // Set values for the parameters in the INSERT statement
	            preparedStatement.setString(1, "3");
	            preparedStatement.setString(2, "Akul");
	            preparedStatement.setString(3, "CSE");
	            preparedStatement.setString(4, "C");

	            // Execute the INSERT statement
	            int rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 0) {
	                System.out.println("Data inserted successfully.");
	            } else {
	                System.out.println("Failed to insert data.");
	            }

	            // Close the resources
	            preparedStatement.close();
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}
