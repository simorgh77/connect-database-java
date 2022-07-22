import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("userName: ");
        var username= scanner.next();
        System.out.println("password: ");
        var password= scanner.next();
        var admin=Admin_validate.validate(username,password);

       if(!admin.Islogin)
           System.out.println("userName or password is wrong!!!");
           else
           new Menu().showMenu();
    }
}
