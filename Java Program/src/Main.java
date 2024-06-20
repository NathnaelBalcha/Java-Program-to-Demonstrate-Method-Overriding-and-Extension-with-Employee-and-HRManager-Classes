/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nathnanel Balcha
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Nati Tesfa", 50000.0);
        employee.work();
        double salary = employee.getSalary();
        System.out.println("Employee's salary: " + salary);
        HRManager hrManager = new HRManager("Merhawi Micky", 70000.0);
        hrManager.work();
        double hrManagerSalary = hrManager.getSalary();
        System.out.println("HR Manager's salary: " + hrManagerSalary);
        hrManager.addEmployee();
    }
}
