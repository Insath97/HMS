 package HMS;

import java.sql.*;

/*
 * @author Mohamed Insath
 */

public class Dconnection {
    
    Connection c;
    Statement s;
    
    
    public Dconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); // important code to coonect
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
