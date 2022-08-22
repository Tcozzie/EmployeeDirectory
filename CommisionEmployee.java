/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author tiegancozzie
 */
public class CommisionEmployee extends Employee {
    double commRate;
    int gSales;

    public CommisionEmployee(String fn, String ln, double cr, int gs) {
        super(fn, ln);
        commRate=cr;
        gSales=gs;
    }
    
    public String toString(){
        return "Employee ID: "+IDNum+", First: "+fName+", Last: "+lName+", Percent: "+commRate+", Sales: "+gSales;
    }
}
