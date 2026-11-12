package org.ioopm.calculator.ast;

public class Log extends Unary{
    public Log(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "log";
    }
}