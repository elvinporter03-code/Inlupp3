package org.ioopm.calculator.ast;

public class Log extends Unary{
    public Log(SymbolicExpression a){
        super(a);
    }

    public String getName() {
        return "log";
    }

    public boolean equals(Object other) {
        if (other instanceof Log) {
            return this.equals((Log) other);
        } else {
            return false;
        }
    }

    public boolean equals(Log other) {
        return this.getArgument() == other.getArgument();
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression arg = this.getArgument().eval(vars);
        if (arg.isConstant()) {
            return new Constant(Math.log(arg.getValue()));
        } else {
            return new Log(arg);
    }
}