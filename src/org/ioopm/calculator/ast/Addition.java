package org.ioopm.calculator.ast;

public class Addition extends Binary{
    public Addition(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }

    public String getName(){
        return "+";
    }

    public int getPriority(){
        return 20;
    }
}