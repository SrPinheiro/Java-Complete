package JDBC.code.DB1.Aplication;

import JDBC.code.DB1.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AtualizarDados {
    public static void main(String[] args) {
        PreparedStatement st = null;

        try(Connection conn = DB.getConnection()){
            st = conn.prepareStatement(
                    "UPDATE department set Name = ? where Id = 7"
            );

            st.setString(1, "Farm");
            int rows = st.executeUpdate();
            System.out.println("Programa Executado com sucesso!");
            System.out.printf("Total de : %d linhas afetadas!\n", rows);


        }catch (Exception e){
            System.out.println("Erro");
            e.printStackTrace();

        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
