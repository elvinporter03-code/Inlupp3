package org.ioopm.calculator.ast;

public abstract class Binary extends SymbolicExpression {
    private SymbolicExpression lhs = null;
    private SymbolicExpression rhs = null;

    public Binary(SymbolicExpression a, SymbolicExpression b){
        this.lhs = a;
        this.rhs = b;
    }
    public String toString() {
        String p = this.lhs.toString() + " " + this.getName();
        if(this.lhs.getPriority() < this.getPriority()){
            p = "(" +this.lhs.toString() + ") " + this.getName();
        } 
        if(this.rhs.getPriority() < this.getPriority()){
            p += " (" + this.rhs.toString() + ") ";
        }
        else {
            p += " " + this.rhs.toString(); 
        }
        return p;
    }
}
