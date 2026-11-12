package org.ioopm.calculator.ast; 
import java.lang.Math;

public abstract class SymbolicExpression {

    public boolean isConstant(){
        return false;
    }

    public String getName(){
        throw new RuntimeException("getName() called on expression with no operator");
    }

    public int getPriority(){
        return 0;
    }

    public double getValue(){
        throw new RuntimeException("getValue() called on non-constant");
    }

    public SymbolicExpression eval(Environment vars){
        return null;
    }
}