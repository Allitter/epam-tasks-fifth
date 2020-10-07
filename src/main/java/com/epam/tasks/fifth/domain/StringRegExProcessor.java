package com.epam.tasks.fifth.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExProcessor implements StringProcessor {
    //language=RegExp
    private static final String CONSONANT_STARTING_WORD =
            "[a-z&&[^aeiou]][a-z]";

    public String removeConsonantStartingWords(String line, int wordLength) {
        String toRemove = arrangeRegExWordLength(wordLength);
        Pattern pattern = Pattern.compile(toRemove, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        return matcher.replaceAll("");
    }

    private String arrangeRegExWordLength(int wordLength) {
        String result = String.format("\\b%s{%d}\\b",
                CONSONANT_STARTING_WORD, wordLength - 1);

        return result;
    }

}

