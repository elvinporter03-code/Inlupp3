package org.ioopm.calculator.ast;

public abstract class Unary extends SymbolicExpression{
    private SymbolicExpression argument = null;

    public Unary(SymbolicExpression a){
        this.argument = a;
    }

    public int getPriority(){
        return 80;
    }

    public String toString() {
    /// Note how the call to toString() is not necessary
        return this.getName() + " " + this.getArgument().toString();
    }

    public SymbolicExpression getArgument(){
        return this.argument;
    }

}