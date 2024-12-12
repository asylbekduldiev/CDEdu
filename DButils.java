import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DButils {
    private static String dbURL = "jbdc:h2:mem:test;INIT=RUNSCRIPT FROM 'classpath:init.sql'";
    private static String dbUsername = "asyl";
    private static String dbPassword = "as";


     public static Connection getConnection(){
        
        Connection connection = null;

        try{
            connection  = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    return connection;

     }
}