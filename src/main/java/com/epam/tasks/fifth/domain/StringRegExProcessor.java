package com.epam.tasks.fifth.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExProcessor implements StringProcessor {
    //language=RegExp
    private static final String CONSONANT_STARTING_WORD =
            "(?i)\\b[bcdfghjklmnpqrstvwxz][a-z]";

    public String removeConsonantStartingWords(String line, int length) {
        String toRemove = arrangeRegExWordLength(length);
        Pattern pattern = Pattern.compile(toRemove);
        Matcher matcher = pattern.matcher(line);

        return matcher.replaceAll("");
    }

    private String arrangeRegExWordLength(int length) {
        String result = String.format("%s{%d}\\b", CONSONANT_STARTING_WORD, length - 1);
        return result;
    }

}

