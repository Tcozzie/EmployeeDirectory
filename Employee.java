/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author tiegancozzie
 */
public class Employee {

    String fName;
    String lName;
    int IDNum;
    static int counter;
    
    public Employee(String fn, String ln){
        fName=fn;
        lName=ln;
        IDNum=counter;
        counter++;
    }    
}
