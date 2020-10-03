package com.epam.tasks.fifth.domain;

public class StringRegExProcessor implements StringProcessor {
    //language=RegExp
    private static final String CONSONANT_STARTING_WORD =
            "(?i)\\b[bcdfghjklmnpqrstvwxz][a-z]";

    public String removeConsonantStartingWords(String line, int length) {
        String toRemove = String.format("%s{%d}\\b", CONSONANT_STARTING_WORD, length - 1);
        return line.replaceAll(toRemove, "");
    }

}

