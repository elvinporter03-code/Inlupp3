package org.ioopm.calculator.ast;

public class Division extends Binary{
    public Division(SymbolicExpression a, SymbolicExpression b){
        super(a,b);
    }

    public String getName() {
        return "/";
    }

    public int getPriority(){
        return 40;
    }
}