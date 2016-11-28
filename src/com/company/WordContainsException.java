package com.company;

import java.io.IOException;


public class WordContainsException extends Exception {

    public WordContainsException(){}

    public WordContainsException(String message) throws IOException{
        super(message);
    }

}
