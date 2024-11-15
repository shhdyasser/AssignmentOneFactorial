//ShahdYasser
import java.util.*;
public class Main {
    public static void main(String[] args) {
        calculateFactorial calc = new calculateFactorial();
        calc.displayOp();
       Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number to calculate its factorial:");
    int n= scan.nextInt();
        calc.setN(n);
        calc.calcFact();
        System.out.println("Factorial "+n+": "+calc.getResult());
    }
}