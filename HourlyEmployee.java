/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author tiegancozzie
 */
public class HourlyEmployee extends Employee {
    double wage;
    int hoursWorked;

    public HourlyEmployee(String fn, String ln, double w, int h) {
        super(fn, ln);
        wage=w;
        hoursWorked=h;
    }
    
    public String toString(){
        return "Employee ID: "+IDNum+", First: "+fName+", Last: "+lName+", Wage: "+wage+", Hours: "+hoursWorked;
    }
}
