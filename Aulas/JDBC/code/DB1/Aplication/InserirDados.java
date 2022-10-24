package JDBC.code.DB1.Aplication;

import JDBC.code.DB1.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class InserirDados {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

        try{
            conn = DB.getConnection();
           st = conn.prepareStatement(
                "INSERT INTO seller " +
                    "(Name,  Email, BirthDate, BaseSalary, DepartmentId)" +
                    "values " +
                    "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );


            st.setString(1, "carl purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date((dt.parse("23/10/2022").getTime())));
            st.setDouble(4, 3000);
            st.setInt(5, 4);


            st = conn.prepareStatement(
                    "INSERT INTO department(Name) values (?)",
                        Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, "Cleaner");

            int rows = st.executeUpdate();

            if(rows > 0){
                ResultSet RS = st.getGeneratedKeys();

                while(RS.next()){
                    int ID = RS.getInt(1);
                    System.out.println("Done, ID: " + ID);
                }
            }else{
                System.out.println("No rows affected");
            }

        }catch (Exception e){
            System.out.println("erro!");
            e.printStackTrace();
        }finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }

    }
}
