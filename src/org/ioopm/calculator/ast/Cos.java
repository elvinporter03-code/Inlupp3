package org.ioopm.calculator.ast;

public class Cos extends Unary{
    public Cos(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "cos";
    }
    public boolean equals(Object other) {
        if (other instanceof Cos) {
            return this.equals((Cos) other);
        } else {
            return false;
        }
    }

    public boolean equals(Cos other) {
        return this.getArgument() == other.getArgument();
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression arg = this.getArgument().eval(vars);
        if (arg.isConstant()) {
            return new Constant(Math.cos(arg.getValue()));
        } else {
            return new Cos(arg);
        }
    }
}