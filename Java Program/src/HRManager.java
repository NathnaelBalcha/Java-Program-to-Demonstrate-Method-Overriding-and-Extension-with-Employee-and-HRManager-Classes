/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nathnanel Balcha
 */
public class HRManager extends Employee {

    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}
