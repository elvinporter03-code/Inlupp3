package org.ioopm.calculator.ast;

public class Cos extends Unary{
    public Cos(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "cos";
    }
}