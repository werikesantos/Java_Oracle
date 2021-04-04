
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        Calculator calculator = new Calculator();        
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        calculator.originalPrice = 10;
        calculator.findTotal();
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
    }
}
