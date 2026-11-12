package org.ioopm.calculator.ast;

public class Exp extends Unary{
    public Exp(SymbolicExpression a){
        super(a);
    }

    public String getName(){
        return "e^";
    }

    public boolean equals(Object other) {
        if (other instanceof Exp) {
            return this.equals((Exp) other);
        } else {
            return false;
        }
    }

    public boolean equals(Exp other) {
        return this.getArgument() == other.getArgument();
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression arg = this.getArgument().eval(vars);
        if (arg.isConstant()) {
            return new Constant(Math.exp(arg.getValue()));
        } else {
            return new Exp(arg);
    }
}