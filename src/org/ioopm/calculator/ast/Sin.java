package org.ioopm.calculator.ast;

public class Sin extends Unary{
    public Sin(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "sin";
    }
}