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

    public boolean equals(Object other) {
        if (other instanceof Addition) {
            return this.equals((Addition) other);
        } else {
            return false;
        }
    }

    public boolean equals(Addition other) {
        return (this.getLhs() == other.getLhs() || this.getLhs() == other.getRhs()) &&  (this.getRhs() == other.getLhs() || this.getRhs() == other.getRhs());
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression lhs = this.getLhs().eval(vars);
        SymbolicExpression rhs = this.getRhs().eval(vars);
        if (lhs.isConstant() && rhs.isConstant()) {
            return new Constant(lhs.getValue() + rhs.getValue());
        } else {
            return new Addition(lhs, rhs);
        }
    }
}