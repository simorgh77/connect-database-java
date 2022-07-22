import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect_to_db {
    public static String databaseUrl = "jdbc:postgresql://localhost:5432/project";
 public static Connection getConnection(){
     try {
         var connection = DriverManager.getConnection(databaseUrl, "postgres", "22552255");
         System.out.println("ارتباط با دیتابیس برقرار شد");
         return connection;
     } catch (SQLException e) {
         throw new RuntimeException("ارتباط با دیتابیس برقرار نشد");
     }
 }
}
