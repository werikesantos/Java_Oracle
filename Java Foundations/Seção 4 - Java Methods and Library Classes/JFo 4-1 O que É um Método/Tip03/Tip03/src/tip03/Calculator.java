
package tip03;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;
    
    public void findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);

    }
}
