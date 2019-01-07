package com.connection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
    
    /* conecction de tipo connection*/
    private static Connection connection = null;
    public static Connection getConnection(){
        if(connection != null)
            return connection;
        else{
            /* primera instancia de acceso a la base de datos*/
            try{
                
                Properties prop = new Properties();
                InputStream inputstream = DBUtil.class.getClassLoader().
                        getResourceAsStream("db.properties");
                
                prop.load(inputstream);
                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String password = prop.getProperty("password");
                
               
                Class.forName(driver);

                connection = DriverManager.getConnection(url, user, password);
                
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return connection;
        }
    }
}
