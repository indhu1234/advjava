package Testsecure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDao 
{
	public boolean validate(LoginBean loginBean)
			throws ClassNotFoundException {
        boolean status = false;
         HttpServletRequest req;
         HttpServletResponse res;
        Class.forName("org.h2.Driver");

                try (Connection connection = DriverManager
            .getConnection("jdbc:h2:tcp://localhost/~/myapp", 
            		"sa", "sa");

            // Step 2:Create a statement using connection object
         
        		
        		
      PreparedStatement preparedStatement = connection
    .prepareStatement("select * from login where username = ?"
    		+ " and password = ? ")) 
     {
       preparedStatement.setString(1, loginBean.getUsername());
       preparedStatement.setString(2, loginBean.getPassword());
      preparedStatement.setString(3, loginBean.getRole());

     System.out.println(preparedStatement);
       ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
           // printSQLException(e);
        	e.printStackTrace();
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
   System.err.println("SQLState: " +
                ((SQLException) e).getSQLState());
   System.err.println("Error Code: " +
                ((SQLException) e).getErrorCode());
   System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
     while (t != null) {
              System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
