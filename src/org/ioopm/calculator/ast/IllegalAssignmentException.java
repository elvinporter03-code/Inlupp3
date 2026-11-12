package org.ioopm.calculator.ast;

public class IllegalAssignmentException extends RuntimeException {
    public IllegalAssignmentException() {
        super("Error! Du kan inte omdefiniera en namngiven konstant!");
    }
}