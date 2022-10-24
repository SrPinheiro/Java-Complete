package JDBC.code.DB1.Aplication;

import JDBC.code.DB1.db.DB;

import java.sql.Connection;
import java.sql.SQLException;

public class ConectarAoBanco {
    public static void main(String[] args) throws SQLException {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
