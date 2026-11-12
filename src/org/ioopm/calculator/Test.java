package org.ioopm.calculator;

import org.ioopm.calculator.ast.*;
import java.util.HashMap;

public class Test{
    public static void main(String [] args){
        Constant c1 = new Constant(5);
        Constant c2 = new Constant(2);
        Variable v = new Variable("x");
        Addition a = new Addition(c1, v);
        Multiplication m = new Multiplication(a, c2);
        System.out.println("(5 + x) * 2 ==> " + m);
        Multiplication m2 = new Multiplication(new Multiplication(c1, c2), new Multiplication(c2, c1));
        Multiplication m3 = new Multiplication(new Addition(c1, c2), new Addition(c2, c1));

        testPrinting("(5.0 + x) * 2.0", m);
        testPrinting("5.0 * 2.0 * 2.0 * 5.0", m2);
        testPrinting("(5.0 + 2.0) * (2.0 + 5.0)", m3);

        Sin b = new Sin(c1);
        testPrinting("sin 5.0", b);

        testPrinting("5.0",c1);
        
        testPrinting("5.0 + x", a);

        SymbolicExpression a1 = new Addition(new Constant(5), new Constant(37));
        SymbolicExpression b1 = new Constant(42);
        testEvaluating(b1, a1); /// Tests if reducing a returns b (it should!)

        // Test that should pass
        SymbolicExpression a2 = new Multiplication(new Constant(5), new Constant(37));
        SymbolicExpression b2 = new Constant(185);
        testEvaluating(b2, a2); 

        SymbolicExpression a3 = new Division(new Constant(6), new Constant(1));
        SymbolicExpression b3 = new Constant(6);
        testEvaluating(b3, a3);

        SymbolicExpression a4 = new Multiplication(c1, c2);
        SymbolicExpression a5 = new Division(new Constant(20), new Constant(2));
        testEvaluating(a4, a5);

        SymbolicExpression s1 = new Sin(new Constant(0));
        testEvaluating(s1, new Constant(0));

        SymbolicExpression n1 = new Negation(c1);
        SymbolicExpression n2 = new Division(new Constant(5), new Constant(-1));
        testEvaluating(n1, n2);
            
        SymbolicExpression b4 = new Exp(new Constant(1));
        testEvaluating(b4, new Constant(2.718281828459045));

        SymbolicExpression l1 = new Log(c1);
        testEvaluating(l1, new Constant(1.6094379124341003));

        SymbolicExpression s2 = new Cos(new Constant(0));
        testEvaluating(s2, new Constant(1));

        SymbolicExpression as = new Assignment(new Constant(7), new Variable("x")); 
        testEvaluating(new Variable("x"), as); 
        

    }

    public static  void testPrinting(String expected, SymbolicExpression e) {
        if (expected.equals("" + e)) {
            System.out.println("Passed: " + e);
        } else {
            System.out.println("Error: expected '" + expected + "' but got '" + e + "'");
        }
    }

    public static void testEvaluating(SymbolicExpression expected, SymbolicExpression e) {
        Environment vars =  new Environment();
        SymbolicExpression r = e.eval(vars);
        SymbolicExpression r1 = expected.eval(vars);    
        if (r.isConstant() && r.equals((Object)r1)) {
            System.out.println("Passed: " + r);
        } else {
            System.out.println("Error: expected '" + r1 + "' but got '" + e + "'");
        }
    }
}