package org.ioopm.calculator.ast;

public class Assignment extends Binary{
public Assignment(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }
    public String getName(){
        throw new RuntimeException("getName() called on expression with no operator");
        return "=";
    }

    public int getPriority(){
        return 100;
    }

    public boolean equals(Object other) {
        if (other instanceof Assignment) {
            return this.equals((Assignment) other);
        } else {
            return false;
        }
    }

    public boolean equals(Assignment other) {
        return this.getLhs() == other.getLhs() && this.getRhs() == other.getRhs();
    }
}