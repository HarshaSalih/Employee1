import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    int code;
    String name;
    String designation;
    double salary;
    String companyName;

    long mobileNo;
    String email;

    public Employee(int code, String name, String designation, double salary, String companyName, long mobileNo, String email) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.mobileNo = mobileNo;
        this.email = email;
    }

}
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {


            }
        }
    }
}
