package org.ioopm.calculator.ast;

public class Multiplication extends Binary{
    public Multiplication(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }

    public String getName() {
        return "*";
    }

    public int getPriority(){
        return 40;
    }
}