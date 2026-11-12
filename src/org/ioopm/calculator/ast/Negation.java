package org.ioopm.calculator.ast;

public class Negation extends Unary{
    public Negation(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "-";
    }

    public boolean equals(Object other) {
        if (other instanceof Negation) {
            return this.equals((Negation) other);
        } else {
            return false;
        }
    }

    public boolean equals(Negation other) {
        return this.getArgument() == other.getArgument();
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression arg = this.getArgument().eval(vars);
        if (arg.isConstant()) {
            return new Constant(-1 * (arg.getValue()));
        } else {
            return new Negation(arg);
    }
}