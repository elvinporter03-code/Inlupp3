package org.ioopm.calculator.ast;

public class Negation extends Unary{
    public Negation(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "-";
    }
}