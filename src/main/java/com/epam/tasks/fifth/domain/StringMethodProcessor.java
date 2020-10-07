package com.epam.tasks.fifth.domain;

public class StringMethodProcessor {
    //language=RegExp
    private static final String CONSONANT_STARTING_WORD =
            "(?i)\\b[a-z&&[^aeiou]][a-z]";

    public String removeConsonantStartingWords(String line, int wordLength) {
        String toRemove = arrangeRegExWordLength(wordLength);

        return line.replaceAll(toRemove, "");
    }

    private String arrangeRegExWordLength(int wordLength) {
        String result = String.format("%s{%d}\\b",
                CONSONANT_STARTING_WORD, wordLength - 1);

        return result;
    }
}
