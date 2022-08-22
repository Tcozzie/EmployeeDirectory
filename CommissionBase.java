/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author tiegancozzie
 */
public class CommissionBase extends CommisionEmployee {
    int base;

    public CommissionBase(String fn, String ln, double cr, int gs, int b) {
        super(fn, ln, cr, gs);
        base=b;
    }
    
    public String toString(){
        return "Employee ID: "+IDNum+", First: "+fName+", Last: "+lName+", Percent: "+commRate+", Sales: "+gSales+", Base: "+base;
    }
}
