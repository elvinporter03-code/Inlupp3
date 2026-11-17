package org.ioopm.calculator;
import org.ioopm.calculator.ast.*;
import org.ioopm.calculator.parser.*;

public class Calculator {
    public static void main(String [] args){
        final CalculatorParser parser = new CalculatorParser();
        final Environment vars = new Environment();
        SymbolicExpression ans = new Variable("ans");
        boolean run = true;
        System.out.print("\033[2J\033[;H");
        System.out.println("Welcome to the Calculator!");
        while(run){
            System.out.print("Please enter an expression: ");
            String input = System.console().readLine();
            try{
                SymbolicExpression expression = parser.parse(input, vars);
                if(expression.isCommand()){
                    run = expression.run(vars);
                } else{
                    SymbolicExpression output = expression.eval(vars);
                    SymbolicExpression a = new Assignment(output, ans).eval(vars);
                    System.out.println(output);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }
}