package util;

/**
 *
 * @author Danny Agamera
 */

import java.sql.*;
import javax.swing.*;

public class ConnectionUtil {
    Connection conn = null;
    
    public static Connection connectdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/homeworkoutusers","root","");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
            return null;
        }
    }
}
