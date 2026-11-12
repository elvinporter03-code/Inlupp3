package org.ioopm.calculator.ast;

public abstract class Binary extends SymbolicExpression {
    private SymbolicExpression lhs = null;
    private SymbolicExpression rhs = null;

    public Binary(SymbolicExpression a, SymbolicExpression b){
        this.lhs = a;
        this.rhs = b;
    }
    public String toString() {
        String p = this.getLhs().toString() + " " + this.getName();
        if(this.getLhs().getPriority() < this.getPriority()){
            p = "(" +this.getLhs().toString() + ") " + this.getName();
        } 
        if(this.getRhs().getPriority() < this.getPriority()){
            p += " (" + this.getRhs().toString() + ")";
        }
        else {
            p += " " + this.getRhs().toString(); 
        }
        return p;
    }
    public SymbolicExpression getLhs(){
        return this.lhs;
    }
    public SymbolicExpression getRhs(){
        return this.rhs;
    }
}
