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

    public boolean equals(Object other) {
        if (other instanceof Variable) {
            return this.equals((Variable) other);
        } else {
            return false;
        }
    }

    public boolean equals(Variable other) {
    /// access a private field of other!
     return this.name == other.name;
    }
}