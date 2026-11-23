
import java.util.Scanner;

class Department {
    private String name;

    Department(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    void showDetails() {
        System.out.println(name + " works in " + department.getName());
    }

    Department getDepartment() {
        return department;
    }
}

public class Practice186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String departmentName = sc.nextLine();
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();

        Department department = new Department(departmentName);

        Employee e1 = new Employee(firstName, department);
        Employee e2 = new Employee(secondName, department);

        e1.showDetails();
        e2.showDetails();

        System.out.println("Shared department: " + (e1.getDepartment() == e2.getDepartment()));

        sc.close();
    }
}
