import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Admin_validate {
//public static PreparedStatement statement=Connect_to_db();
    public static Admin validate(String _username, String _password){

       try (var connection = Connect_to_db.getConnection();){
           var sqlQuery= """
                select * from admin where username=? and password=?
                """;

           var selectStatement = connection.prepareStatement(sqlQuery);
           selectStatement.setString(1,_username);
           selectStatement.setString(2,_password);

           var resultSet = selectStatement.executeQuery();
           Admin admin=new Admin();
           while (resultSet.next() ){
               admin =new Admin(resultSet.getInt("id"),
                       resultSet.getString("username") ,
                       resultSet.getString("password"),
                       resultSet.getString("first_name"),
                       resultSet.getString("last_name"),
                       resultSet.getString("national_code"),
                       true
                       );

               return admin;
           }
            return admin;

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
    }

//    public static void crete_Admin(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please enter userName");
//        var username=scanner.next();
//        System.out.println("please enter password");
//        var password=scanner.next();
//        System.out.println("please enter firstName");
//        var firstname=scanner.next();
//        System.out.println("please enter lastName");
//        var lastname=scanner.next();
//        System.out.println("please enter nationalCode");
//        var nationalCode=scanner.next();
//
//        try (var connection = Connect_to_db.getConnection();){
//            var insertQuery= """
//                  insert into admin (first_name, last_name,username, password, national_code) VALUES (?,?,?,?,?);
//                """;
//
//           try(var insertStatement = connection.prepareStatement(insertQuery)) {
//               insertStatement.setString(1,firstname);
//               insertStatement.setString(2,lastname);
//               insertStatement.setString(3,username);
//               insertStatement.setString(4,password);
//               insertStatement.setString(5,nationalCode);
//               insertStatement.execute();
//               System.out.println("done!");
//           }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public static ArrayList<Admin> list_of_admins(){
//        try (var connection = Connect_to_db.getConnection();){
//            var allAdminsQuery= """
//                  select * from admin;
//                """;
//
//            try(var getAdminStatement = connection.prepareStatement(allAdminsQuery)) {
//
//              var resultSet= getAdminStatement.executeQuery();
//              var AdminList=new ArrayList<Admin>();
//
//             while (resultSet.next()){
//                 var admin=new Admin(resultSet.getInt("id"),
//                         resultSet.getString("username") ,
//                         resultSet.getString("password"),
//                         resultSet.getString("first_name"),
//                         resultSet.getString("last_name"),
//                         resultSet.getString("national_code"),false);
//                 AdminList.add(admin);
//             }
//
//              return AdminList;
//            }
//
//
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void delete_admin(){
//        try (var connection = Connect_to_db.getConnection();){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("please enter userName");
//            var username=scanner.next();
//            System.out.println("please enter password");
//            var password=scanner.next();
//            var Delete_Query= """
//                  delete from admin where username=? and password=?;
//                """;
//
//            try(var Delete_AdminStatement = connection.prepareStatement(Delete_Query)) {
//                Delete_AdminStatement.setString(1,username);
//                Delete_AdminStatement.setString(2,password);
//                var resultSet= Delete_AdminStatement.execute();
//                System.out.println("done");
//            }
//            catch (SQLException e){
//                System.out.println("not found admin!!");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static ArrayList<Admin> search(){
//        try (var connection = Connect_to_db.getConnection();){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("please type username or name of your admin");
//            var pattern=scanner.next();
//
//            var search_Query= """
//                  select * from admin where username like ? or first_name like ?;
//                """;
//
//            try(var Search_AdminStatement = connection.prepareStatement(search_Query)) {
//              Search_AdminStatement.setString(1,'%'+pattern+'%');
//              Search_AdminStatement.setString(2,'%'+pattern+'%');
//
//                var resultSet= Search_AdminStatement.executeQuery();
//
//
//                var foundedAdmins=new ArrayList<Admin>();
//
//                while (resultSet.next()){
//                    var admin=new Admin(resultSet.getInt("id"),
//                            resultSet.getString("username") ,
//                            resultSet.getString("password"),
//                            resultSet.getString("first_name"),
//                            resultSet.getString("last_name"),
//                            resultSet.getString("national_code"),false);
//                    foundedAdmins.add(admin);
//                }
//
//                return foundedAdmins;
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
////    edit
//    static void edit_Admin(){
//
//        try (var connection = Connect_to_db.getConnection();){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("please insert username");
//            var username=scanner.next();
//            System.out.println("which field do you update(first_name,last_name,username,password,national_code)");
//            var field=scanner.next();
//            System.out.println("please insert new value of %s".formatted(field));
//            var update_value=scanner.next();
//            var update_Query= """
//                 update admin  set %s = ? where username = ?;
//                """.formatted(field);
//
//            try(var update_AdminStatement = connection.prepareStatement(update_Query)) {
//
//                update_AdminStatement.setString(1,update_value);
//                update_AdminStatement.setString(2,username);
//
//                 update_AdminStatement.execute();
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//
//    }

}
