package org.ioopm.calculator.ast;

public class Variable extends Atom{
    private String name = null;
    public Variable(String a){
        this.name = a;
    }
    public String toString() {
        return this.name;
    }
    public int getPriority(){
        return 100;
    }
}