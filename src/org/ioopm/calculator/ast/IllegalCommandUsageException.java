package org.ioopm.calculator.ast;

public class IllegalCommandUsageException extends RuntimeException {
    public IllegalCommandUsageException() {
        super("Error! Någonting som inte är ett kommando parsar till ett kommando?");
    }
}