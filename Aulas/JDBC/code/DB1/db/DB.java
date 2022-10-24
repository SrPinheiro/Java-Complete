package JDBC.code.DB1.db;

import JDBC.code.DB1.Exception.DBException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection conn = null;

    public static void closeStatement(Statement st){
        try{
            st.close();
        }catch (SQLException e){
            //
        }
    }

    public static void closeResultSet(ResultSet st){
        try{
            st.close();
        }catch (SQLException e){
            //
        }
    }

    public static Connection getConnection(){
        try {
            if (conn == null){
                Properties props = loadProperties();
                String URL = props.getProperty("dburl");
                conn = DriverManager.getConnection(URL, props);
            }
            return conn;

        }catch (SQLException e){
            e.getStackTrace();
            throw new DBException("Erro getConnection");
        }
    }


    private static Properties loadProperties(){
        try(FileInputStream FS =  new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(FS);
            return props;

        }catch (IOException e){
            throw new DBException("Erro ao acessar Properties");
        }
    }


    public static void closeConnection(){
        try {
            if (conn != null)
                conn.close();
        }catch (SQLException e){
            e.getStackTrace();
            throw new DBException("Erro ao acessar closeConnection");
        }
    }
}
