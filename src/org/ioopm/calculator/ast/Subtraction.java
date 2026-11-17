package org.ioopm.calculator.ast;

public class Subtraction extends Binary{
    public Subtraction(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }

    public String getName() {
        return "-";
    }

    public int getPriority(){
        return 20;
    }

    public boolean equals(Object other) {
        if (other instanceof Subtraction) {
            return this.equals((Subtraction) other);
        } else {
            return false;
        }
    }

    public boolean equals(Subtraction other) {
        return this.getLhs() == other.getLhs() && this.getRhs() == other.getRhs();
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression lhs = this.getLhs().eval(vars);
        SymbolicExpression rhs = this.getRhs().eval(vars);
        if (lhs.isConstant() && rhs.isConstant()) {
            return new Constant(lhs.getValue() - rhs.getValue());
        } else {
            return new Subtraction(lhs, rhs);
        }
    }    
}