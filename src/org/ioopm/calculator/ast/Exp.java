package org.ioopm.calculator.ast;

public class Exp extends Unary{
    public Exp(SymbolicExpression a){
        super(a);
    }

    public String getName(){
        return "e^";
    }
}