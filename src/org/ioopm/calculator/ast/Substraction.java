package org.ioopm.calculator.ast;

public class Subtraction extends Binary{
    public Subtraction(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }

    public String getName() {
        return "-";
    }

    public int getPriority(){
        return 20;
    }
}