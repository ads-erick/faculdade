import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // Integração com BD
        try{
            String url = "jdbc:mysql://localhost:3306/poo_2";
            String user = "root";
            String password = "univille";
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão com sucesso!");
            /*String insert = "insert into  pessoa(nome,sobrenome,idade) " +
                    "values('Peter','Parker',16);";
            Statement stat = con.createStatement();
            stat.execute(insert);*/
            String delete = "delete from  pessoa";
            Statement stat = con.createStatement();
            stat.execute(delete);
        } catch (Exception e) {
            System.out.println("Deu erro.");
            e.printStackTrace();
        }
    }

}