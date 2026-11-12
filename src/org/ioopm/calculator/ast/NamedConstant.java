package org.ioopm.calculator.ast;

public class NamedConstant extends Atom{
    private String name;
    private double value;


    public NamedConstant(String name, double value){
        this.value = value;
        this.name = name;
    }
        
    public boolean isNamedConstant(){
        return true;
    }

    public SymbolicExpression eval(Environment vars){
        return new Constant(this.value);
    }
}