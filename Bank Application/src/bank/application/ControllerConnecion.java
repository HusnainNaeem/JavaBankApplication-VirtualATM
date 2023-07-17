package bank.application;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

class ControllerConnection {
    Connection connect;
    Statement statement;
    
    public ControllerConnection(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankModel","root","");    
            statement = connect.createStatement(); 
        } catch(Exception e){ 
            System.out.println(e);
        }  
    }  
    public Connection getConnection(){
        return connect;
    }
}
