package net.quipV.DBO;


import java.sql.*;

public class MySQLConnection {
    private static final MySQLConnection mySQLConnection = new MySQLConnection();
    private Connection connection;
    private MySQLConnection(){
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quipv?useSSL=false", "root", "");
        }catch (Exception e){ System.out.println(e);}
    }

    public static MySQLConnection getInstance(){
        return mySQLConnection;
    }

    public Connection getConnection(){
        return this.connection;
    }
}
