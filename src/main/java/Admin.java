import java.util.Scanner;

public class Admin {
    int id;
     String username;
      String password;
     String first_name;
      String last_name;
     String national_code;

     Boolean Islogin=false;


    public Admin(int id, String username, String password, String first_name, String last_name, String national_code ,Boolean Islogin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_code = national_code;
        this.Islogin=Islogin;
    }

    public Admin() {
    }
}
