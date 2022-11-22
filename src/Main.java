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
                switch (option) {
                    case 1:
                        System.out.println("Enter employee details");
                        Scanner obj = new Scanner(System.in);
                        System.out.println("Enter the code");
                        int code = obj.nextInt();
                        System.out.println("Enter name");
                        String name = obj.next();
                        System.out.println("Enter designation");
                        String designation = obj.next();
                        System.out.println("Enter salary");
                        double salary = obj.nextDouble();
                        System.out.println("Enter company name");
                        String companyName = obj.next();
                        System.out.println("Enter phn No.");
                        long phnNo = obj.nextLong();
                        System.out.println("Enter email");
                        String emailId = obj.next();
                        Employee e = new Employee(code, name, designation, salary, companyName, phnNo, emailId);
                        arrEmp.add(e);
                        break;


                }
            }
        }
    }
}
