import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Menu {


void showMenu() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome");
    System.out.println("1- Create Admin");
    System.out.println("2- Edit Admin");
    System.out.println("3- Admins Lists");
    System.out.println("4- Search");
    System.out.println("5- Delete Admin");
    System.out.println("6- Exit");

    var options = scanner.next();
    var Admin_list=new ArrayList<Admin>();
//    var select = switch (options) {
//
//        case "1" -> {
//        Admin_validate.crete_Admin();
//        showMenu();
//            yield 1;
//        }
//        case "2" -> {
//           Admin_validate.edit_Admin();
//            showMenu();
//            yield 2;
//        }
//
//        case "3" -> {
//       Admin_list=  Admin_validate.list_of_admins();
//       Admin_list.stream();
//       Admin_list.forEach((admin)-> System.out.println("first_name: %s last_name: %s username :%s national_code : %s".
//               formatted(admin.first_name,admin.last_name,admin.username,admin.national_code)));
//            showMenu();
//            yield 3;
//        }
//        case "4" -> {
//
//       var foundedAdmin= Admin_validate.search().stream();
//       foundedAdmin.forEach((admin)-> System.out.println("first_name: %s last_name: %s username :%s national_code : %s".
//               formatted(admin.first_name,admin.last_name,admin.username,admin.national_code)));
//            showMenu();
//            yield 4;
//        }
//        case "5" -> {
//          Admin_validate.delete_admin();
//            showMenu();
//            yield 5;
//        }
//        case "6"->{
//            System.exit(0);
//            yield 6;
//
//        }
//        default -> throw new RuntimeException();
//    };


}
}
