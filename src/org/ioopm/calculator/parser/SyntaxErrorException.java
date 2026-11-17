package org.ioopm.calculator.parser;

public class SyntaxErrorException extends RuntimeException {
    public SyntaxErrorException(String msg) {
        super(msg);
    }
}