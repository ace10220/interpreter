package com.ace10220;

import java.io.Reader;

public class Lexer {
    private int tok;
    private Object val;
    private LexerReader reader;

    public Lexer(Reader r) {
        reader = new LexerReader(r);
    }

    public int token() {
        return tok;
    }

    public Object value() {
        return val;
    }

    public boolean advance() {
        return false;
    }

    private void lexDigit() throws Exception {
        
    }

    private void skipWhiteSpace() throws Exception {
        
    }
}
