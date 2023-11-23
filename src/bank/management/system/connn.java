package bank.management.system;

import java.sql.*;

public class connn {
    Connection connection;
    Statement statement;
    public connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksys","root","");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}