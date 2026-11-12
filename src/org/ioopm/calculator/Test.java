import org.ioopm.calculator.ast.*;
public class Test{
    public static void main(String [] args){
        Constant c1 = new Constant(5);
        Constant c2 = new Constant(2);
        Variable v = new Variable("x");
        Addition a = new Addition(c1, v);
        Multiplication m = new Multiplication(a, c2);
        System.out.println("(5 + x) * 2 ==> " + m);

        testPrinting("(5.0 + x) * 2.0", m);

        Sin b = new Sin(c1);
        testPrinting("sin 5.0", b);

        testPrinting("5.0",c1);
        
        testPrinting("5.0 + x",a);
    }

    public static  void testPrinting(String expected, SymbolicExpression e) {
        if (expected.equals("" + e)) {
            System.out.println("Passed: " + e);
        } else {
            System.out.println("Error: expected '" + expected + "' but got '" + e + "'");
        }
    }
}