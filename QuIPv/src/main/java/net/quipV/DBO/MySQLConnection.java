package net.quipV.DBO;


import java.sql.*;

public class MySQLConnection {
//    public static void main(String args[]){
//        try{
//            Connection con=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/quipv?useSSL=false","root","");
//
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("select * from sdr_live_maintable");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));
//            con.close();
//        }catch(Exception e){ System.out.println(e);}
//    }
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
