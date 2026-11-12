package org.ioopm.calculator.ast;

public class Assignment extends Binary{
public Assignment(SymbolicExpression a, SymbolicExpression b){
        super(a, b);
    }
    public String getName(){
        throw new RuntimeException("getName() called on expression with no operator");
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
        return this.getLhs().equals(other.getLhs()) && this.getRhs().equals(other.getRhs());
    }

    public SymbolicExpression eval(Environment vars) {
        SymbolicExpression lhs = this.getLhs().eval(vars);
        SymbolicExpression result = vars.put((Variable) this.getRhs(), lhs);
        return lhs;
    }
}