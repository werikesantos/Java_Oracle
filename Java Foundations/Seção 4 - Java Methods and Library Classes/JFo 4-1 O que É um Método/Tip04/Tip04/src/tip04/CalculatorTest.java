
package tip04;

public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        //Name your friends
        calc.findTotal(10, null);
        calc.findTotal(12, null);
        calc.findTotal(9,  null);
        calc.findTotal(8,  null);
        calc.findTotal(7,  null);
        calc.findTotal(15, "Alex");
        calc.findTotal(11, null);
        calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       
    } 
}
