package org.ioopm.calculator.ast;

public class Clear extends Command{
    public Clear(Environment vars){
        vars.clear();
    }
}